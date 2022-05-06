package com.desertheat;

import com.google.common.primitives.Ints;
import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.events.*;
import net.runelite.api.widgets.WidgetID;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

import java.awt.*;
import java.util.*;

@Slf4j
@PluginDescriptor(
	name = "Desert Heat"
)
public class DesertHeatPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private DesertHeatConfig config;

	@Inject
	private DesertHeatOverlay overlay;

	@Inject
	private OverlayManager overlayManager;

	public int tickCount;
	public int drainRate, drainRateUpdated;
	public int sipTimer;
	public int waterServingsCount;

	public boolean dropFlag = false;


	@Override
	protected void startUp() throws Exception
	{
		log.info("Example started!");
		overlayManager.add(overlay);
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("Example stopped!");
	}


	@Subscribe
	public void onGameTick(GameTick gameTick)
	{
		tickCount = tickCount + 1;

		sipTimer =  sipTimer - 1;

		Player player = client.getLocalPlayer();

		// System.out.println("TICK");

		if (player == null){
			return;
		}
		// if the player walks through a a reset area stop the timer (areas would be shantypass, pollinivieach, bandit camp.. etc) areas where desert heat resets
		if (ResetAreas.ShantyPass.contains2D(player.getWorldLocation())){
			// tickCount = -1;
			sipTimer = -1;

		}

	}

	@Subscribe
	public void onItemContainerChanged(ItemContainerChanged itemContainerChanged){
		// if water was consumed
		if (waterServingsCount > getNumberOfWaterServings() && !dropFlag){

			if (config.showOffsetMessages()) {
				client.addChatMessage(ChatMessageType.GAMEMESSAGE, "","timer off by: " +(drainRate - tickCount) + " ticks","");
			}
			tickCount = 0;
			sipTimer = calculateConsumptionTicks();
			drainRate = calculateConsumptionTicks();

		}

		drainRateUpdated = calculateConsumptionTicks();

		waterServingsCount = getNumberOfWaterServings();
	}


	// reset if you take desert damage
	@Subscribe
	public void onChatMessage(ChatMessage chatMessage)
	{
		// System.out.println(chatMessage.getMessage());

		if (Objects.equals(chatMessage.getMessage(), "You start dying of thirst while you're in the desert.")
				){
			tickCount = 0;
			sipTimer = calculateConsumptionTicks();
			drainRate = calculateConsumptionTicks();
		}

	}





	// this is equivalent to "on loaded into game" like the game actually starts and ticks start going
	// reset all important variables
	@Subscribe
	public void onWidgetClosed(WidgetClosed widgetClosed)
	{

		if ( widgetClosed.getGroupId() == WidgetID.MINIMAP_GROUP_ID ||  widgetClosed.getGroupId() == WidgetID.LOGIN_CLICK_TO_PLAY_GROUP_ID){
			tickCount = 0;
			waterServingsCount = getNumberOfWaterServings();
			drainRate = calculateConsumptionTicks();
		}
	}


	public int getNumberOfWaterServings(){
		int count = 0;
		ItemContainer container = client.getItemContainer(InventoryID.INVENTORY);

		if (container == null){
			return 0;
		}

		// TODO add chocoice and all the other water items
		for (Item item: container.getItems()){
			if (item.getId() == ItemID.WATERSKIN4) {
				count+= 4;
			} else if (item.getId() == ItemID.WATERSKIN3) {
				count+= 3;
			} else if (item.getId() == ItemID.WATERSKIN2){
				count+= 2;
			} else if (item.getId() == ItemID.WATERSKIN1){
				count+= 1;
			} else if (item.getId() == ItemID.WATERSKIN0){

			}
		}

		return count;

	}

	public int calculateConsumptionTicks(){

		int manualOffset = 0;
		try	{
			manualOffset =  Integer.parseInt(config.manualOffset());
		} catch (NumberFormatException error){
			if (config.showOffsetMessages()){
				client.addChatMessage(ChatMessageType.GAMEMESSAGE, "","DESERT HEAT PLUGIN : manual offset should be integer, default is 0","");
			}
		}


		int baseDrainRate = 150 + manualOffset;
		ItemContainer container = client.getItemContainer(InventoryID.EQUIPMENT);

		if (container == null){
			return 150;
		}

		Item[] items = container.getItems(); // TODO check if this is null

		// TODO to avoid index out of bound errors loop through each value in items and then compare o(n) so kinda ass but w/e better than
		// getting an error
		// TODO OR DONT RUN ON START UP
		// if theres not items the base rate

		if (EffectedGear.effectedHeads.contains(items[EquipmentInventorySlot.HEAD.getSlotIdx()].getId())){
			baseDrainRate = baseDrainRate - 10;
		}

		if (EffectedGear.effectedTorsos.contains(items[EquipmentInventorySlot.BODY.getSlotIdx()].getId())){
			//client.addChatMessage(ChatMessageType.GAMEMESSAGE, "","effect torso: on", null);
			baseDrainRate = baseDrainRate - 40;
		}

		// check legs
		if (EffectedGear.effectedLegs.contains(items[EquipmentInventorySlot.LEGS.getSlotIdx()].getId())){
			baseDrainRate = baseDrainRate - 30;
		}

		// CHECK boots
		if (EffectedGear.effectedBoots.contains(items[EquipmentInventorySlot.BOOTS.getSlotIdx()].getId())){
			baseDrainRate = baseDrainRate - 10;
		}

		// CHECK Gloves
		if (EffectedGear.effectedGloves.contains(items[EquipmentInventorySlot.GLOVES.getSlotIdx()].getId())){
			baseDrainRate = baseDrainRate - 10;
		}

		// CHECK shield
		if (EffectedGear.effectedShields.contains(items[EquipmentInventorySlot.SHIELD.getSlotIdx()].getId())){
			baseDrainRate = baseDrainRate - 10;
		}

		return baseDrainRate;
	}

	public int convertTicksToSeconds(int ticks){
		return (int) (ticks * 0.6);

	}


	public String convertTicksToTime(int ticks){
		int seconds = (int) (ticks * 0.6);
		int p1 = seconds % 60;
		int p2 = seconds / 60;
		int p3 = p2 % 60;
		p2 = p2 / 60;
		return ( p2 + ":" + p3 + ":" + p1);
	}

	@Provides
	DesertHeatConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(DesertHeatConfig.class);
	}
}
