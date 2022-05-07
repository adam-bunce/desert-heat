package com.desertheat;

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

		if (player == null){
			return;
		}
		// if the player walks through a a reset area stop the timer (areas would be shantypass, pollinivieach, bandit camp.. etc) areas where desert heat resets
		if (ResetAreas.ShantyPass.contains2D(player.getWorldLocation())){
			// tickCount = -1;
			sipTimer = -1;

		}

		// maybe thres faster way to do this kidna slow
		for (int i = 0; i < ResetAreas.desertArea.length; i++){
			if(ResetAreas.desertArea[i].contains2D(player.getWorldLocation())){
				overlayManager.add(overlay);
				break;
			}
			else{
				overlayManager.remove(overlay);
			}
		}
	}

	@Subscribe
	public void onItemContainerChanged(ItemContainerChanged itemContainerChanged){
		// if water was consumed
//		if (waterServingsCount > getNumberOfWaterServings() && !dropFlag){
//
//			if (config.showOffsetMessages()) {
//				client.addChatMessage(ChatMessageType.GAMEMESSAGE, "","timer off by: " +(drainRate - tickCount) + " ticks","");
//			}
//			tickCount = 0;
//			sipTimer = calculateConsumptionTicks();
//			drainRate = calculateConsumptionTicks();
//
//		}

		drainRateUpdated = calculateConsumptionTicks();

		waterServingsCount = getNumberOfWaterServings();
	}


	// reset if you take desert damage
	@Subscribe
	public void onChatMessage(ChatMessage chatMessage)
	{
		// these are said but dont appear in chat
		List resetMessages = Arrays.asList ("You start dying of thirst while you're in the desert.", "You take a drink of water.", "You eat a choc ice.");
		System.out.println(chatMessage.getMessage());
		if (resetMessages.contains(chatMessage.getMessage())){
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
			sipTimer = 0;
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

	// this is calculated in ticks not seconds
	public int calculateConsumptionTicks(){

		int manualOffset = 0;
		try	{
			manualOffset =  Integer.parseInt(config.manualOffset());
		} catch (NumberFormatException error){
			if (config.showOffsetMessages()){
				client.addChatMessage(ChatMessageType.GAMEMESSAGE, "","DESERT HEAT PLUGIN : manual offset should be integer, default is 0","");
			}
		}

		int baseDrainRate = 150 + manualOffset  + calculateClothingBonus();

		ItemContainer container = client.getItemContainer(InventoryID.EQUIPMENT);

		if (container == null){
			return 150;
		}

		// check head
		if (container.getItem(EquipmentInventorySlot.HEAD.getSlotIdx()) != null && EffectedEquipment.effectedHeads.contains(container.getItem(EquipmentInventorySlot.HEAD.getSlotIdx()).getId())){
			baseDrainRate = baseDrainRate - 10;
		}

		// check body
		if (container.getItem(EquipmentInventorySlot.BODY.getSlotIdx()) != null && EffectedEquipment.effectedTorsos.contains(container.getItem(EquipmentInventorySlot.BODY.getSlotIdx()).getId())){
			baseDrainRate = baseDrainRate - 40;
		}

		// check legs
		if (container.getItem(EquipmentInventorySlot.LEGS.getSlotIdx()) != null && EffectedEquipment.effectedLegs.contains(container.getItem(EquipmentInventorySlot.LEGS.getSlotIdx()).getId())){
			baseDrainRate = baseDrainRate - 30;
		}

		// CHECK boots
		if (container.getItem(EquipmentInventorySlot.BOOTS.getSlotIdx()) != null && EffectedEquipment.effectedBoots.contains(container.getItem(EquipmentInventorySlot.BOOTS.getSlotIdx()).getId())){
			baseDrainRate = baseDrainRate - 10;
		}

		// CHECK Gloves
		if (container.getItem(EquipmentInventorySlot.GLOVES.getSlotIdx()) != null && EffectedEquipment.effectedGloves.contains(container.getItem(EquipmentInventorySlot.GLOVES.getSlotIdx()).getId())){
			baseDrainRate = baseDrainRate - 10;
		}

		// CHECK shield
		if (container.getItem(EquipmentInventorySlot.SHIELD.getSlotIdx()) != null && EffectedEquipment.effectedShields.contains(container.getItem(EquipmentInventorySlot.SHIELD.getSlotIdx()).getId())){
			baseDrainRate = baseDrainRate - 10;
		}

		return baseDrainRate;
	}

	// this is all in ticks
	public int calculateClothingBonus() {
		int bonus = 0;
		ItemContainer container = client.getItemContainer(InventoryID.EQUIPMENT);

		if (container == null) {
			return 0;
		}

		// check head
		if (container.getItem(EquipmentInventorySlot.HEAD.getSlotIdx()) != null && EffectedEquipment.bonusHeads.contains(container.getItem(EquipmentInventorySlot.HEAD.getSlotIdx()).getId())) {
			bonus += 20;
		} else {
			// if it is the prospectors' helmet https://oldschool.runescape.wiki/w/Prospector_kit
			if (container.getItem(EquipmentInventorySlot.HEAD.getSlotIdx()) != null && (container.getItem(EquipmentInventorySlot.HEAD.getSlotIdx()).getId()) == ItemID.PROSPECTOR_HELMET) {
				// this is really 6.66 but 7 is close enough
				bonus += 7;
			}
		}

		// check body
		if (container.getItem(EquipmentInventorySlot.BODY.getSlotIdx()) != null && EffectedEquipment.bonusTorsos.contains(container.getItem(EquipmentInventorySlot.BODY.getSlotIdx()).getId())) {
			bonus += 20;
		} else {
			// if it is the desert top https://oldschool.runescape.wiki/w/Desert_outfit
			if (container.getItem(EquipmentInventorySlot.BODY.getSlotIdx()) != null && (container.getItem(EquipmentInventorySlot.BODY.getSlotIdx()).getId()) == ItemID.DESERT_TOP_6388) {
				bonus += 10;
			}
		}

		// check legs
		if (container.getItem(EquipmentInventorySlot.LEGS.getSlotIdx()) != null && EffectedEquipment.bonusLegs.contains(container.getItem(EquipmentInventorySlot.LEGS.getSlotIdx()).getId())) {
			bonus += 20;
		}

		// CHECK boots
		if (container.getItem(EquipmentInventorySlot.BOOTS.getSlotIdx()) != null && EffectedEquipment.bonusBoots.contains(container.getItem(EquipmentInventorySlot.BOOTS.getSlotIdx()).getId())) {
			bonus += 10;
		}

		return bonus;
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

		String p1Text, p2Text, p3Text;
		p1Text = p2Text = p3Text = "";

		if (p1 < 10){
			p1Text = "0" + p1;
		}else{
			p1Text = String.valueOf(p1);
		}

		if (p2 <= 0){
			p2Text = "";
		} else if (p2 < 10){
			p2Text = "0:" + p2;
		}else{
			p2Text = String.valueOf(p2) + ":";
		}

		if (p3 < 10){
			p3Text = "0" + p3;
		}else{
			p3Text = String.valueOf(p3);
		}


		return ( p2Text  + p3Text + ":" + p1Text);
	}

	@Provides
	DesertHeatConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(DesertHeatConfig.class);
	}
}
