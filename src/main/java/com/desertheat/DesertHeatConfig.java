package com.desertheat;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("example")
public interface DesertHeatConfig extends Config
{


	@ConfigItem(
			keyName = "manualOffset",
			name = "Manual Timer Offset",
			description = "Offsets when the waterskin consumption timer resets",
			position = 0
	)
	default String manualOffset(){
		return "0";
	}

	@ConfigItem(

			keyName = "showOffsetMessages",
			name = "Show Offset Helper Messages",
			description = "Adds messages to chat to help user adjust the manual offset so the countdown timer resets on correct tick",
			position = 1
	)
	default boolean showOffsetMessages()
	{
		return false;
	}

	@ConfigItem(
			keyName = "showWaterServings",
			name = "Show Water Servings",
			description = "Toggles Water Servings on the UI",
			position = 2
	)
	default boolean showWaterServings()
	{
		return true;
	}

	@ConfigItem(
			keyName = "showDrainRate",
			name = "Show Drain Rate",
			description = "Toggles Drain Rate on the UI",
			position = 3
	)
	default boolean showDrainRate()
	{
		return true;
	}


	@ConfigItem(
			keyName = "timeFormat",
			name = "Time Format",
			description = "Sets the time format in the UI to either seconds or ticks",
			position = 4

	)
	default TimeFormatConfig timeFormat()
	{
		return TimeFormatConfig.SECONDS;
	}


}
