package com.desertheat;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TimeFormatConfig
{
    SECONDS("Seconds", .6),
    TICKS("Ticks", 1);

    private final String timeFormat;
    private final double adjustmentFactor;

    @Override
    public String toString()
    {
        return timeFormat;
    }
}

