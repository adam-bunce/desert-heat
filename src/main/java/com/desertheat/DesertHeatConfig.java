package com.desertheat;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("example")
public interface DesertHeatConfig extends Config
{
	@ConfigItem(
		keyName = "showOffsetMessages",
		name = "Show Offset Helper Messages",
		description = "Adds messages to chat to help user adjust the manual offset so the countdown timer resets on correct tick"
	)
	default boolean showOffsetMessages()
	{
		return false;
	}

	@ConfigItem(
			keyName = "manualOffset",
			name = "Manual Timer Offset",
			description = "Offsets when the waterskin consumption timer resets"
	)
	default String manualOffset(){
		return "0";
	}
}
