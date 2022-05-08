package com.desertheat;

import com.google.common.collect.ImmutableSet;
import net.runelite.api.ItemID;

import java.util.Set;


/**
 * list of all the items of gear that reduce the time between desert heat ticks
 * ( that I currently know of ), some are hardcoded b/c they dont follow the pattern
 */
public class EffectedEquipment {

    static final Set<Integer> effectedTorsos = ImmutableSet.of(
        // Melee Torsos
            ItemID.BRONZE_PLATEBODY,
            ItemID.BRONZE_PLATEBODY_G,
            ItemID.BRONZE_PLATEBODY_T,
            ItemID.BRONZE_CHAINBODY,

            ItemID.IRON_PLATEBODY,
            ItemID.IRON_PLATEBODY_G,
            ItemID.IRON_PLATEBODY_T,
            ItemID.IRON_CHAINBODY,

            ItemID.STEEL_PLATEBODY,
            ItemID.STEEL_PLATEBODY_G,
            ItemID.STEEL_PLATEBODY_T,
            ItemID.STEEL_CHAINBODY,

            ItemID.BLACK_PLATEBODY,
            ItemID.BLACK_PLATEBODY_G,
            ItemID.BLACK_PLATEBODY_H1,
            ItemID.BLACK_PLATEBODY_H2,
            ItemID.BLACK_PLATEBODY_H3,
            ItemID.BLACK_PLATEBODY_H4,
            ItemID.BLACK_PLATEBODY_H5,
            ItemID.BLACK_PLATEBODY_T,
            ItemID.BLACK_CHAINBODY,

            ItemID.WHITE_PLATEBODY,
            ItemID.WHITE_CHAINBODY,

            ItemID.MITHRIL_PLATEBODY,
            ItemID.MITHRIL_PLATEBODY_G,
            ItemID.MITHRIL_PLATEBODY_T,
            ItemID.MITHRIL_CHAINBODY,

            ItemID.INITIATE_HAUBERK,

            ItemID.SHAYZIEN_BODY_5,

            ItemID.ADAMANT_PLATEBODY,
            ItemID.ADAMANT_PLATEBODY_20415,
            ItemID.ADAMANT_PLATEBODY_G,
            ItemID.ADAMANT_PLATEBODY_H1,
            ItemID.ADAMANT_PLATEBODY_H2,
            ItemID.ADAMANT_PLATEBODY_H3,
            ItemID.ADAMANT_PLATEBODY_H4,
            ItemID.ADAMANT_PLATEBODY_H5,
            ItemID.ADAMANT_PLATEBODY_T,
            ItemID.ADAMANT_CHAINBODY,

            ItemID.SAMURAI_SHIRT,

            ItemID.PROSELYTE_HAUBERK,
            ItemID.PROSELYTE_HAUBERK_20564,

            ItemID.RUNE_PLATEBODY,
            ItemID.RUNE_PLATEBODY_20421,
            ItemID.RUNE_PLATEBODY_G,
            ItemID.RUNE_PLATEBODY_H1,
            ItemID.RUNE_PLATEBODY_H2,
            ItemID.RUNE_PLATEBODY_H3,
            ItemID.RUNE_PLATEBODY_H4,
            ItemID.RUNE_PLATEBODY_H5,
            ItemID.RUNE_PLATEBODY_T,
            ItemID.GILDED_CHAINBODY,
            ItemID.SARADOMIN_PLATEBODY,
            ItemID.GUTHIX_PLATEBODY,
            ItemID.ZAMORAK_PLATEBODY,
            ItemID.ARMADYL_PLATEBODY,
            ItemID.BANDOS_PLATEBODY,
            ItemID.ANCIENT_PLATEBODY,
            ItemID.RUNE_CHAINBODY,

            ItemID.ROCKSHELL_PLATE,

            ItemID.VOID_KNIGHT_TOP,
            ItemID.VOID_KNIGHT_TOP_BROKEN,
            ItemID.VOID_KNIGHT_TOP_L,
            ItemID.VOID_KNIGHT_TOP_OR,

            ItemID.GRANITE_BODY,

            ItemID.OBSIDIAN_PLATEBODY,

            ItemID.DRAGON_PLATEBODY,
            ItemID.DRAGON_PLATEBODY_G,
            ItemID.DRAGON_CHAINBODY,
            ItemID.DRAGON_CHAINBODY_3140,
            ItemID.DRAGON_CHAINBODY_20428,
            ItemID.DRAGON_CHAINBODY_G,

            // third age id??

            ItemID.BANDOS_CHESTPLATE,
            ItemID.BANDOS_CHESTPLATE_OR,

            ItemID.AHRIMS_ROBETOP,
            ItemID.AHRIMS_ROBETOP_0,
            ItemID.AHRIMS_ROBETOP_25,
            ItemID.AHRIMS_ROBETOP_50,
            ItemID.AHRIMS_ROBETOP_75,
            ItemID.AHRIMS_ROBETOP_100,
            ItemID.AHRIMS_ROBETOP_100,
            ItemID.AHRIMS_ROBETOP_20598,

            ItemID.DHAROKS_PLATEBODY,
            ItemID.DHAROKS_PLATEBODY_0,
            ItemID.DHAROKS_PLATEBODY_25,
            ItemID.DHAROKS_PLATEBODY_50,
            ItemID.DHAROKS_PLATEBODY_75,
            ItemID.DHAROKS_PLATEBODY_100,
            ItemID.DHAROKS_PLATEBODY_25515,

            ItemID.GUTHANS_PLATEBODY,
            ItemID.GUTHANS_PLATEBODY_0,
            ItemID.GUTHANS_PLATEBODY_25,
            ItemID.GUTHANS_PLATEBODY_50,
            ItemID.GUTHANS_PLATEBODY_75,
            ItemID.GUTHANS_PLATEBODY_100,

            ItemID.KARILS_LEATHERTOP,
            ItemID.KARILS_LEATHERTOP_0,
            ItemID.KARILS_LEATHERTOP_25,
            ItemID.KARILS_LEATHERTOP_50,
            ItemID.KARILS_LEATHERTOP_75,
            ItemID.KARILS_LEATHERTOP_100,
            ItemID.KARILS_LEATHERTOP_23632,

            ItemID.TORAGS_PLATEBODY,
            ItemID.TORAGS_PLATEBODY_25,
            ItemID.TORAGS_PLATEBODY_50,
            ItemID.TORAGS_PLATEBODY_75,
            ItemID.TORAGS_PLATEBODY_100,

            ItemID.VERACS_BRASSARD,
            ItemID.VERACS_BRASSARD_0,
            ItemID.VERACS_BRASSARD_25,
            ItemID.VERACS_BRASSARD_50,
            ItemID.VERACS_BRASSARD_75,
            ItemID.VERACS_BRASSARD_100,

            ItemID.JUSTICIAR_CHESTGUARD,

            ItemID.TORVA_PLATEBODY,
            ItemID.TORVA_PLATEBODY_DAMAGED,

            ItemID.FIGHTER_TORSO,
            ItemID.FIGHTER_TORSO_BROKEN,
            ItemID.FIGHTER_TORSO_L

    );

    static final Set<Integer> effectedHeads = ImmutableSet.of(
            ItemID.BRONZE_MED_HELM,
            ItemID.BRONZE_FULL_HELM,
            ItemID.BRONZE_FULL_HELM_G,
            ItemID.BRONZE_FULL_HELM_T,

            ItemID.IRON_MED_HELM,
            ItemID.IRON_FULL_HELM,
            ItemID.IRON_FULL_HELM_G,
            ItemID.IRON_FULL_HELM_T,

            ItemID.STEEL_MED_HELM,
            ItemID.STEEL_FULL_HELM,
            ItemID.STEEL_FULL_HELM_G,
            ItemID.STEEL_FULL_HELM_T,

            ItemID.BLACK_MED_HELM,
            ItemID.BLACK_FULL_HELM,
            ItemID.BLACK_FULL_HELM_G,
            ItemID.BLACK_FULL_HELM_T,

            ItemID.WHITE_MED_HELM,
            ItemID.WHITE_FULL_HELM,

            ItemID.MITHRIL_MED_HELM,
            ItemID.MITHRIL_FULL_HELM,
            ItemID.MITHRIL_FULL_HELM_G,
            ItemID.MITHRIL_FULL_HELM_T,

            ItemID.INITIATE_SALLET,

            ItemID.SHAYZIEN_HELM_1,
            ItemID.SHAYZIEN_HELM_2,
            ItemID.SHAYZIEN_HELM_3,
            ItemID.SHAYZIEN_HELM_4,
            ItemID.SHAYZIEN_HELM_5,

            ItemID.ADAMANT_MED_HELM,
            ItemID.ADAMANT_MED_HELM_6895,
            ItemID.ADAMANT_FULL_HELM,
            ItemID.ADAMANT_FULL_HELM_20561,
            ItemID.ADAMANT_FULL_HELM_G,
            ItemID.ADAMANT_FULL_HELM_T,

            ItemID.SAMURAI_KASA,

            ItemID.PROSELYTE_SALLET,
            ItemID.PROSELYTE_SALLET_20563,

            ItemID.RUNE_MED_HELM,
            ItemID.RUNE_FULL_HELM,
            ItemID.RUNE_FULL_HELM_G,
            ItemID.RUNE_FULL_HELM_T,
            ItemID.RUNE_HERALDIC_HELM,
            ItemID.RUNE_HERALDIC_HELM_8466,
            ItemID.RUNE_HERALDIC_HELM_8468,
            ItemID.RUNE_HERALDIC_HELM_8470,
            ItemID.RUNE_HERALDIC_HELM_8472,
            ItemID.RUNE_HERALDIC_HELM_8474,
            ItemID.RUNE_HERALDIC_HELM_8476,
            ItemID.RUNE_HERALDIC_HELM_8478,
            ItemID.RUNE_HERALDIC_HELM_8480,
            ItemID.RUNE_HERALDIC_HELM_8482,
            ItemID.RUNE_HERALDIC_HELM_8484,
            ItemID.RUNE_HERALDIC_HELM_8486,
            ItemID.RUNE_HERALDIC_HELM_8488,
            ItemID.RUNE_HERALDIC_HELM_8490,
            ItemID.RUNE_HERALDIC_HELM_8492,
            ItemID.RUNE_HERALDIC_HELM_8494,

            ItemID.ROCKSHELL_HELM,

            ItemID.VOID_MELEE_HELM,
            ItemID.VOID_MELEE_HELM_BROKEN,
            ItemID.VOID_MELEE_HELM_L,
            ItemID.VOID_MELEE_HELM_OR,
            ItemID.VOID_RANGER_HELM,
            ItemID.VOID_RANGER_HELM_BROKEN,
            ItemID.VOID_RANGER_HELM_L,
            ItemID.VOID_RANGER_HELM_OR,
            ItemID.VOID_MAGE_HELM,
            ItemID.VOID_MAGE_HELM_BROKEN,
            ItemID.VOID_MAGE_HELM_L,
            ItemID.VOID_MAGE_HELM_OR,

            ItemID.GRANITE_HELM,

            ItemID.OBSIDIAN_HELMET,

            ItemID.DRAGON_MED_HELM,
            ItemID.DRAGON_MED_HELM_6967,
            ItemID.DRAGON_FULL_HELM,

            // third age?

            ItemID.BANDOS_TASSETS,
            ItemID.BANDOS_TASSETS_23646,
            ItemID.BANDOS_TASSETS_OR,


            ItemID.AHRIMS_HOOD,
            ItemID.AHRIMS_HOOD_0,
            ItemID.AHRIMS_HOOD_25,
            ItemID.AHRIMS_HOOD_50,
            ItemID.AHRIMS_HOOD_75,
            ItemID.AHRIMS_HOOD_100,

            ItemID.DHAROKS_HELM,
            ItemID.DHAROKS_HELM_0,
            ItemID.DHAROKS_HELM_25,
            ItemID.DHAROKS_HELM_50,
            ItemID.DHAROKS_HELM_75,
            ItemID.DHAROKS_HELM_100,

            ItemID.GUTHANS_HELM,
            ItemID.GUTHANS_HELM_0,
            ItemID.GUTHANS_HELM_25,
            ItemID.GUTHANS_HELM_50,
            ItemID.GUTHANS_HELM_75,
            ItemID.GUTHANS_HELM_100,

            ItemID.KARILS_COIF,
            ItemID.KARILS_COIF_0,
            ItemID.KARILS_COIF_25,
            ItemID.KARILS_COIF_50,
            ItemID.KARILS_COIF_75,
            ItemID.KARILS_COIF_100,

            ItemID.TORAGS_HELM,
            ItemID.TORAGS_HELM_25,
            ItemID.TORAGS_HELM_50,
            ItemID.TORAGS_HELM_75,
            ItemID.TORAGS_HELM_100,

            ItemID.VERACS_HELM,
            ItemID.VERACS_HELM_0,
            ItemID.VERACS_HELM_25,
            ItemID.VERACS_HELM_50,
            ItemID.VERACS_HELM_75,
            ItemID.VERACS_HELM_100,

            ItemID.JUSTICIAR_FACEGUARD,

            ItemID.TORVA_FULL_HELM,
            ItemID.TORVA_FULL_HELM_DAMAGED,

            ItemID.SLAYER_HELMET,
            ItemID.FREMENNIK_HELM,
            ItemID.WARRIOR_HELM,
            ItemID.WARRIOR_HELM_20571,
            ItemID.BERSERKER_HELM,
            ItemID.HELM_OF_NEITIZNOT,
            ItemID.NEITIZNOT_FACEGUARD,
            ItemID.SERPENTINE_HELM,
            ItemID.SERPENTINE_HELM_UNCHARGED,
            ItemID.SERPENTINE_VISAGE


    );

    static final Set<Integer> effectedLegs = ImmutableSet.of(
            ItemID.BRONZE_PLATELEGS,
            ItemID.BRONZE_PLATELEGS_G,
            ItemID.BRONZE_PLATELEGS_T,
            ItemID.BRONZE_PLATESKIRT,
            ItemID.BRONZE_PLATESKIRT_G,
            ItemID.BRONZE_PLATESKIRT_T,

            ItemID.IRON_PLATELEGS,
            ItemID.IRON_PLATELEGS_G,
            ItemID.IRON_PLATELEGS_T,
            ItemID.IRON_PLATESKIRT,
            ItemID.IRON_PLATESKIRT_G,
            ItemID.IRON_PLATESKIRT_T,

            ItemID.STEEL_PLATELEGS,
            ItemID.STEEL_PLATELEGS_G,
            ItemID.STEEL_PLATELEGS_T,
            ItemID.STEEL_PLATESKIRT,
            ItemID.STEEL_PLATESKIRT_G,
            ItemID.STEEL_PLATESKIRT_T,

            ItemID.BLACK_PLATELEGS,
            ItemID.BLACK_PLATELEGS_G,
            ItemID.BLACK_PLATELEGS_T,
            ItemID.BLACK_PLATESKIRT,
            ItemID.BLACK_PLATESKIRT_G,
            ItemID.BLACK_PLATESKIRT_T,

            ItemID.WHITE_PLATELEGS,
            ItemID.WHITE_PLATESKIRT,

            ItemID.MITHRIL_PLATELEGS,
            ItemID.MITHRIL_PLATELEGS_G,
            ItemID.MITHRIL_PLATELEGS_T,
            ItemID.MITHRIL_PLATESKIRT,
            ItemID.MITHRIL_PLATESKIRT_G,
            ItemID.MITHRIL_PLATESKIRT_T,

            ItemID.INITIATE_SALLET,

            ItemID.ADAMANT_PLATELEGS,
            ItemID.ADAMANT_PLATELEGS_G,
            ItemID.ADAMANT_PLATELEGS_T,
            ItemID.ADAMANT_PLATESKIRT,
            ItemID.ADAMANT_PLATESKIRT_G,
            ItemID.ADAMANT_PLATESKIRT_T,

            ItemID.SAMURAI_GREAVES,

            ItemID.PROSELYTE_CUISSE,
            ItemID.PROSELYTE_CUISSE_20565,
            ItemID.PROSELYTE_TASSET,



            // TODO keep going from here, currently on legs of melee armor
            ItemID.RUNE_PLATEBODY,
            ItemID.RUNE_PLATEBODY_20421,
            ItemID.RUNE_PLATEBODY_G,
            ItemID.RUNE_PLATEBODY_H1,
            ItemID.RUNE_PLATEBODY_H2,
            ItemID.RUNE_PLATEBODY_H3,
            ItemID.RUNE_PLATEBODY_H4,
            ItemID.RUNE_PLATEBODY_H5,
            ItemID.RUNE_PLATEBODY_T,
            ItemID.GILDED_CHAINBODY,
            ItemID.SARADOMIN_PLATEBODY,
            ItemID.GUTHIX_PLATEBODY,
            ItemID.ZAMORAK_PLATEBODY,
            ItemID.ARMADYL_PLATEBODY,
            ItemID.BANDOS_PLATEBODY,
            ItemID.ANCIENT_PLATEBODY,
            ItemID.RUNE_CHAINBODY,

            ItemID.ROCKSHELL_PLATE,

            ItemID.VOID_KNIGHT_TOP,
            ItemID.VOID_KNIGHT_TOP_BROKEN,
            ItemID.VOID_KNIGHT_TOP_L,
            ItemID.VOID_KNIGHT_TOP_OR,

            ItemID.GRANITE_BODY,

            ItemID.OBSIDIAN_PLATEBODY,

            ItemID.DRAGON_PLATEBODY,
            ItemID.DRAGON_PLATEBODY_G,
            ItemID.DRAGON_CHAINBODY,
            ItemID.DRAGON_CHAINBODY_3140,
            ItemID.DRAGON_CHAINBODY_20428,
            ItemID.DRAGON_CHAINBODY_G,

            // third age id??

            ItemID.BANDOS_CHESTPLATE,
            ItemID.BANDOS_CHESTPLATE_OR,

            ItemID.AHRIMS_ROBETOP,
            ItemID.AHRIMS_ROBETOP_0,
            ItemID.AHRIMS_ROBETOP_25,
            ItemID.AHRIMS_ROBETOP_50,
            ItemID.AHRIMS_ROBETOP_75,
            ItemID.AHRIMS_ROBETOP_100,
            ItemID.AHRIMS_ROBETOP_20598,

            ItemID.DHAROKS_PLATEBODY,
            ItemID.DHAROKS_PLATEBODY_0,
            ItemID.DHAROKS_PLATEBODY_25,
            ItemID.DHAROKS_PLATEBODY_50,
            ItemID.DHAROKS_PLATEBODY_75,
            ItemID.DHAROKS_PLATEBODY_100,
            ItemID.DHAROKS_PLATEBODY_25515,

            ItemID.GUTHANS_PLATEBODY,
            ItemID.GUTHANS_PLATEBODY_0,
            ItemID.GUTHANS_PLATEBODY_25,
            ItemID.GUTHANS_PLATEBODY_50,
            ItemID.GUTHANS_PLATEBODY_75,
            ItemID.GUTHANS_PLATEBODY_100,

            ItemID.KARILS_LEATHERTOP,
            ItemID.KARILS_LEATHERTOP_0,
            ItemID.KARILS_LEATHERTOP_25,
            ItemID.KARILS_LEATHERTOP_50,
            ItemID.KARILS_LEATHERTOP_75,
            ItemID.KARILS_LEATHERTOP_100,
            ItemID.KARILS_LEATHERTOP_23632,

            ItemID.TORAGS_PLATEBODY,
            ItemID.TORAGS_PLATEBODY_25,
            ItemID.TORAGS_PLATEBODY_50,
            ItemID.TORAGS_PLATEBODY_75,
            ItemID.TORAGS_PLATEBODY_100,

            ItemID.VERACS_BRASSARD,
            ItemID.VERACS_BRASSARD_0,
            ItemID.VERACS_BRASSARD_25,
            ItemID.VERACS_BRASSARD_50,
            ItemID.VERACS_BRASSARD_75,
            ItemID.VERACS_BRASSARD_100,

            // justicar chestguard id

            ItemID.TORVA_PLATEBODY,
            ItemID.TORVA_PLATEBODY_DAMAGED,

            ItemID.FIGHTER_TORSO,
            ItemID.FIGHTER_TORSO_BROKEN,
            ItemID.FIGHTER_TORSO_L
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

    // Desert top (overcoat) is hardcoded as +6 seconds (not 12)
    static final Set<Integer> bonusTorsos = ImmutableSet.of(
            ItemID.DESERT_SHIRT,
            ItemID.PROSPECTOR_JACKET,
            ItemID.DESERT_TOP
    );

    static final Set<Integer> bonusLegs = ImmutableSet.of(
            ItemID.DESERT_ROBE,
            ItemID.PROSPECTOR_LEGS,
            ItemID.DESERT_LEGS,
            ItemID.DESERT_ROBES
    );

    static final Set<Integer> bonusBoots = ImmutableSet.of(
            ItemID.DESERT_BOOTS,
            ItemID.PROSPECTOR_BOOTS
    );

    // prospector helm is hard coded as +4 seconds (not 12)
    static final Set<Integer> bonusHeads = ImmutableSet.of(
        ItemID.MENAPHITE_PURPLE_HAT
    );


}
