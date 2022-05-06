package com.desertheat;

import com.google.common.collect.ImmutableSet;
import net.runelite.api.ItemID;

import java.util.Set;


/**
 * list of all the items of gear that reduce
 * the time between desert heat ticks ( that I currently know of )
 */
public class EffectedGear {


    static final Set<Integer> effectedTorsos = ImmutableSet.of(
            ItemID.DRAGON_CHAINBODY,
            ItemID.DRAGON_CHAINBODY_3140,
            ItemID.DRAGON_CHAINBODY_20428,
            ItemID.DRAGON_CHAINBODY_G,
            ItemID.RUNE_CHAINBODY,
            ItemID.BLACK_DHIDE_BODY,
            ItemID.BLACK_DHIDE_BODY_20423

    );

    static final Set<Integer> effectedHeads = ImmutableSet.of(
            ItemID.DRAGON_MED_HELM,
            ItemID.DRAGON_MED_HELM_6967,
            ItemID.HELM_OF_RAEDWALD,
            ItemID.LEATHER_COWL,
            ItemID.SPINY_HELMET

    );

    static final Set<Integer> effectedLegs = ImmutableSet.of(
            ItemID.DRAGON_PLATELEGS,
            ItemID.DRAGON_PLATELEGS_4180,
            ItemID.DRAGON_PLATELEGS_20429,
            ItemID.VERACS_PLATESKIRT,
            ItemID.VERACS_PLATESKIRT_0,
            ItemID.VERACS_PLATESKIRT_25,
            ItemID.VERACS_PLATESKIRT_50,
            ItemID.VERACS_PLATESKIRT_75,
            ItemID.VERACS_PLATESKIRT_100,
            ItemID.VERACS_PLATESKIRT_23635
    );


    static final Set<Integer> effectedBoots = ImmutableSet.of(
            ItemID.DRAGON_BOOTS,
            ItemID.SNAKESKIN_BOOTS,
            ItemID.DRAGON_BOOTS_G,
            ItemID.DRAGONSTONE_BOOTS
    );


    static final Set<Integer> effectedGloves = ImmutableSet.of(
            ItemID.BLACK_DHIDE_VAMBRACES,
            ItemID.BANDOS_BRACERS,
            ItemID.ANCIENT_BRACERS
    );

    static final Set<Integer> effectedShields = ImmutableSet.of(
            ItemID.MITHRIL_SQ_SHIELD

    );


}
