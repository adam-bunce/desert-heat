package com.desertheat;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("desertheat")
public interface DesertHeatConfig extends Config
{
	@ConfigItem(
			keyName = "manualOffset",
			name = "Manual Timer Offset",
			description = "Offsets when the waterskin consumption timer resets.",
			position = 0
	)
	default String manualOffset(){
		return "0";
	}

	@ConfigItem(

			keyName = "showOffsetMessages",
			name = "Show Offset Helper Messages",
			description = "Adds messages to chat to help user accurately adjust the manual offset.",
			position = 1
	)
	default boolean showOffsetMessages()
	{
		return false;
	}

	@ConfigItem(
			keyName = "showWaterServings",
			name = "Show Water Servings",
			description = "Toggles whether \"Servings: __\" is visible in the overlay.",
			position = 2
	)
	default boolean showWaterServings()
	{
		return true;
	}

	@ConfigItem(
			keyName = "showDrainRate",
			name = "Show Drain Rate",
			description = "Toggles whether \"Drain Rate: every __\" is visible in the overlay.",
			position = 3
	)
	default boolean showDrainRate()
	{
		return true;
	}

	@ConfigItem(
			keyName = "howTimeLeft",
			name = "Show Time Left",
			description = "Toggles whether \"Time Left: __\" is visible in the overlay.",
			position = 4
	)
	default boolean showTimeLeft()
	{
		return true;
	}


	@ConfigItem(
			keyName = "showDrainBar",
			name = "Show Drain Bar",
			description = "Toggles whether the drain bar is visible in the overlay.",
			position = 5
	)
	default boolean showDrainBar()
	{
		return true;
	}


	@ConfigItem(
			keyName = "timeFormat",
			name = "Time Format",
			description = "Sets the overlay countdown timers to display in Ticks or Seconds.",
			position = 6

	)
	default TimeFormatConfig timeFormat()
	{
		return TimeFormatConfig.SECONDS;
	}


}
