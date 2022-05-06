package com.desertheat;

import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;


/**
 * These are areas where the desert heat timer gets reset
 */
public class ResetAreas {

    static final WorldArea ShantyPass = new WorldArea(3294, 3116, 19, 13, 0);
    // (3295, 3126, 3311, 3116);

    static final WorldArea[] desertArea= {
            new WorldArea(3201, 2645, 336, 486, 0),
            new WorldArea(3130, 2877, 70, 194, 0),
            new WorldArea(3132, 2627, 66, 174, 0),
            new WorldArea(3420, 3131, 65, 35, 0),
            new WorldArea(3399, 3131, 21, 28, 0),
            new WorldArea(3390, 3131, 9, 8, 0)
    };
}
