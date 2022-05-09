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
        // Melee Section
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
            ItemID.FIGHTER_TORSO_L,

            // Ranged Section
            ItemID.LEATHER_BODY,
            ItemID.LEATHER_BODY_G,
            ItemID.STUDDED_BODY,
            ItemID.STUDDED_BODY_26264,
            ItemID.STUDDED_BODY_G,
            ItemID.STUDDED_BODY_T,
            ItemID.FROGLEATHER_BODY,
            ItemID.SNAKESKIN_BODY,
            ItemID.RANGERS_TUNIC,
            ItemID.GREEN_DHIDE_BODY,
            ItemID.GREEN_DHIDE_BODY_G,
            ItemID.GREEN_DHIDE_BODY_T,
            ItemID.SPINED_BODY,
            ItemID.BLUE_DHIDE_BODY,
            ItemID.BLUE_DHIDE_BODY_G,
            ItemID.BLUE_DHIDE_BODY_T,
            ItemID.RED_DHIDE_BODY,
            ItemID.RED_DHIDE_BODY_G,
            ItemID.RED_DHIDE_BODY_T,
            ItemID.BLACK_DHIDE_BODY,
            ItemID.BLACK_DHIDE_BODY_G,
            ItemID.BLACK_DHIDE_BODY_T,

            ItemID.ANCIENT_DHIDE_BODY,
            ItemID.ARMADYL_DHIDE_BODY,
            ItemID.BANDOS_DHIDE_BODY,
            ItemID.GUTHIX_DHIDE_BODY,
            ItemID.SARADOMIN_DHIDE_BODY,
            ItemID.ZAMORAK_DHIDE_BODY,

            ItemID.CRYSTAL_BODY,

            // third age

            ItemID.ARMADYL_CHESTPLATE,
            ItemID.ARMADYL_CHESTPLATE_OR,


            // Mage
            ItemID.SPLITBARK_BODY,
            ItemID.SWAMPBARK_BODY,
            ItemID.BLOODBARK_BODY,
            ItemID.LUNAR_TORSO,
            ItemID.ANCESTRAL_ROBE_TOP
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
            ItemID.SERPENTINE_VISAGE,

            // range section
            ItemID.LEATHER_COWL,
            ItemID.COIF,
            ItemID.SNAKESKIN_BANDANA,
            ItemID.SPINED_HELM,
            ItemID.ROBIN_HOOD_HAT,


            ItemID.ANCIENT_COIF,
            ItemID.ARMADYL_COIF,
            ItemID.BANDOS_COIF,
            ItemID.GUTHIX_COIF,
            ItemID.SARADOMIN_COIF,
            ItemID.ZAMORAK_COIF,

            ItemID.CRYSTAL_HELM,

            // third age

            ItemID.ARMADYL_HELMET,
            ItemID.ARMADYL_HELMET_OR,

            // Mage
            ItemID.SPLITBARK_HELM_20568,
            ItemID.SPLITBARK_HELM,
            ItemID.SWAMPBARK_HELM,
            ItemID.BLOODBARK_HELM,
            ItemID.LUNAR_HELM,
            ItemID.ANCESTRAL_HAT,
            ItemID.ANCESTRAL_HAT_25518



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

            ItemID.RUNE_PLATELEGS,
            ItemID.RUNE_PLATELEGS_G,
            ItemID.RUNE_PLATELEGS_T,
            ItemID.GILDED_CHAINBODY,
            ItemID.SARADOMIN_PLATELEGS,
            ItemID.GUTHIX_PLATELEGS,
            ItemID.ZAMORAK_PLATELEGS,
            ItemID.ARMADYL_PLATELEGS,
            ItemID.BANDOS_PLATELEGS,
            ItemID.ANCIENT_PLATELEGS,
            ItemID.RUNE_PLATESKIRT,
            ItemID.RUNE_PLATESKIRT_G,
            ItemID.RUNE_PLATESKIRT_T,

            ItemID.ROCKSHELL_LEGS,

            ItemID.VOID_KNIGHT_ROBE,
            ItemID.VOID_KNIGHT_ROBE_BROKEN,
            ItemID.VOID_KNIGHT_ROBE_L,
            ItemID.VOID_KNIGHT_ROBE_OR,

            ItemID.GRANITE_LEGS,

            ItemID.OBSIDIAN_PLATELEGS,

            ItemID.DRAGON_PLATELEGS,
            ItemID.DRAGON_PLATELEGS_G,
            ItemID.DRAGON_PLATESKIRT,
            ItemID.DRAGON_PLATESKIRT_G,

            // third age id??

            ItemID.BANDOS_TASSETS,
            ItemID.BANDOS_TASSETS_OR,

            ItemID.AHRIMS_ROBESKIRT,
            ItemID.AHRIMS_ROBESKIRT_0,
            ItemID.AHRIMS_ROBESKIRT_25,
            ItemID.AHRIMS_ROBESKIRT_50,
            ItemID.AHRIMS_ROBESKIRT_75,
            ItemID.AHRIMS_ROBESKIRT_100,

            ItemID.DHAROKS_PLATELEGS,
            ItemID.DHAROKS_PLATELEGS_0,
            ItemID.DHAROKS_PLATELEGS_25,
            ItemID.DHAROKS_PLATELEGS_50,
            ItemID.DHAROKS_PLATELEGS_75,
            ItemID.DHAROKS_PLATELEGS_100,

            ItemID.GUTHANS_CHAINSKIRT,
            ItemID.GUTHANS_CHAINSKIRT_0,
            ItemID.GUTHANS_CHAINSKIRT_25,
            ItemID.GUTHANS_CHAINSKIRT_50,
            ItemID.GUTHANS_CHAINSKIRT_75,
            ItemID.GUTHANS_CHAINSKIRT_100,

            ItemID.KARILS_LEATHERSKIRT,
            ItemID.KARILS_LEATHERSKIRT_0,
            ItemID.KARILS_LEATHERSKIRT_25,
            ItemID.KARILS_LEATHERSKIRT_50,
            ItemID.KARILS_LEATHERSKIRT_75,
            ItemID.KARILS_LEATHERSKIRT_100,

            ItemID.TORAGS_PLATELEGS,
            ItemID.TORAGS_PLATELEGS_25,
            ItemID.TORAGS_PLATELEGS_50,
            ItemID.TORAGS_PLATELEGS_75,
            ItemID.TORAGS_PLATELEGS_100,

            ItemID.VERACS_PLATESKIRT,
            ItemID.VERACS_PLATESKIRT_0,
            ItemID.VERACS_PLATESKIRT_25,
            ItemID.VERACS_PLATESKIRT_50,
            ItemID.VERACS_PLATESKIRT_75,
            ItemID.VERACS_PLATESKIRT_100,

            ItemID.JUSTICIAR_LEGGUARDS,

            ItemID.TORVA_PLATELEGS,
            ItemID.TORVA_PLATELEGS_DAMAGED,

            // Ranged section
            ItemID.LEATHER_CHAPS,
            ItemID.LEATHER_CHAPS_G,
            ItemID.STUDDED_CHAPS,
            ItemID.STUDDED_CHAPS_G,
            ItemID.STUDDED_CHAPS_T,
            ItemID.FROGLEATHER_CHAPS,
            ItemID.SNAKESKIN_CHAPS,
            ItemID.RANGERS_TIGHTS,
            ItemID.GREEN_DHIDE_CHAPS,
            ItemID.GREEN_DHIDE_CHAPS_G,
            ItemID.GREEN_DHIDE_CHAPS_T,
            ItemID.SPINED_CHAPS,
            ItemID.BLUE_DHIDE_CHAPS,
            ItemID.BLUE_DHIDE_CHAPS_G,
            ItemID.BLUE_DHIDE_CHAPS_T,
            ItemID.RED_DHIDE_CHAPS,
            ItemID.RED_DHIDE_CHAPS_G,
            ItemID.RED_DHIDE_CHAPS_T,
            ItemID.BLACK_DHIDE_CHAPS,
            ItemID.BLACK_DHIDE_CHAPS_G,
            ItemID.BLACK_DHIDE_CHAPS_T,

            ItemID.ANCIENT_CHAPS,
            ItemID.ARMADYL_CHAPS,
            ItemID.BANDOS_CHAPS,
            ItemID.GUTHIX_CHAPS,
            ItemID.SARADOMIN_CHAPS,
            ItemID.ZAMORAK_CHAPS,

            ItemID.CRYSTAL_LEGS,

            // third age

            ItemID.ARMADYL_CHAINSKIRT,
            ItemID.ARMADYL_CHAINSKIRT_OR,


            // Mage
            ItemID.SPLITBARK_LEGS,
            ItemID.SWAMPBARK_LEGS,
            ItemID.BLOODBARK_LEGS,
            ItemID.LUNAR_LEGS,
            ItemID.ANCESTRAL_ROBE_BOTTOM


    );

    static final Set<Integer> effectedBoots = ImmutableSet.of(
            ItemID.BRONZE_BOOTS,
            ItemID.IRON_BOOTS,
            ItemID.STEEL_BOOTS,
            ItemID.BLACK_BOOTS,
            ItemID.WHITE_BOOTS,
            ItemID.MITHRIL_BOOTS,
            ItemID.SHAYZIEN_BOOTS_1,
            ItemID.SHAYZIEN_BOOTS_2,
            ItemID.SHAYZIEN_BOOTS_3,
            ItemID.SHAYZIEN_BOOTS_4,
            ItemID.SHAYZIEN_BOOTS_5,
            ItemID.ADAMANT_BOOTS,
            ItemID.SAMURAI_GREAVES,
            ItemID.RUNE_BOOTS,
            ItemID.ROCKSHELL_BOOTS,
            ItemID.GRANITE_BOOTS,
            ItemID.DRAGON_BOOTS,
            ItemID.DRAGON_BOOTS_G,
            ItemID.BANDOS_BOOTS,
            ItemID.BANDOS_BOOTS_OR,
            ItemID.PRIMORDIAL_BOOTS,

            // Ranged Section
            ItemID.FROGLEATHER_BOOTS,
            ItemID.SNAKESKIN_BOOTS,
            ItemID.SNAKESKIN_BOOTS_20580,
            ItemID.RANGER_BOOTS,
            ItemID.SPINED_BOOTS,

            ItemID.ANCIENT_DHIDE_BOOTS,
            ItemID.ARMADYL_DHIDE_BOOTS,
            ItemID.BANDOS_DHIDE_BOOTS,
            ItemID.GUTHIX_DHIDE_BOOTS,
            ItemID.SARADOMIN_DHIDE_BOOTS,
            ItemID.ZAMORAK_DHIDE_BOOTS,
            ItemID.PEGASIAN_BOOTS,

            // Mage
            ItemID.SPLITBARK_BOOTS,
            ItemID.SWAMPBARK_BOOTS,
            ItemID.BLOODBARK_BOOTS,
            ItemID.LUNAR_BOOTS,
            ItemID.ETERNAL_BOOTS
    );

    static final Set<Integer> effectedGloves = ImmutableSet.of(
            ItemID.HARDLEATHER_GLOVES,
            ItemID.BRONZE_GLOVES,
            ItemID.IRON_GLOVES,
            ItemID.STEEL_GLOVES,
            ItemID.BLACK_GLOVES,
            ItemID.WHITE_GLOVES,
            ItemID.MITHRIL_GLOVES,
            ItemID.SHAYZIEN_GLOVES_1,
            ItemID.SHAYZIEN_GLOVES_2,
            ItemID.SHAYZIEN_GLOVES_3,
            ItemID.SHAYZIEN_GLOVES_4,
            ItemID.SHAYZIEN_GLOVES_5,
            ItemID.ADAMANT_GLOVES,
            ItemID.SAMURAI_GLOVES,
            ItemID.RUNE_GLOVES,
            ItemID.ROCKSHELL_GLOVES,
            ItemID.GRANITE_GLOVES,
            ItemID.DRAGON_GLOVES,
            ItemID.BARROWS_GLOVES,
            ItemID.BARROWS_GLOVES_23593,

            // Ranged Section
            // leather vamb dont effect
            ItemID.SNAKESKIN_VAMBRACES,
            ItemID.RANGER_GLOVES,
            ItemID.GREEN_DHIDE_VAMBRACES,
            ItemID.SPINED_GLOVES,
            ItemID.VOID_KNIGHT_GLOVES,
            ItemID.VOID_KNIGHT_GLOVES_BROKEN,
            ItemID.VOID_KNIGHT_GLOVES_L,
            ItemID.VOID_KNIGHT_GLOVES_OR,
            ItemID.BLUE_DHIDE_VAMBRACES,
            ItemID.RED_DHIDE_VAMBRACES,
            ItemID.BLACK_DHIDE_VAMBRACES,


            ItemID.ANCIENT_BRACERS,
            ItemID.ARMADYL_BRACERS,
            ItemID.BANDOS_BRACERS,
            ItemID.GUTHIX_BRACERS,
            ItemID.SARADOMIN_BRACERS,
            ItemID.ZAMORAK_BRACERS,
            ItemID.ZARYTE_VAMBRACES,


            // Mage
            ItemID.SPLITBARK_GAUNTLETS,
            ItemID.SWAMPBARK_GAUNTLETS,
            ItemID.BLOODBARK_GAUNTLETS,
            ItemID.LUNAR_GLOVES


    );

    // pretty sure wiki is wrong and shields do count, in tests it was 10 ticks so minumum time is 24 seconds
    static final Set<Integer> effectedShields = ImmutableSet.of(
            // square shields
            ItemID.BRONZE_SQ_SHIELD,
            ItemID.IRON_SQ_SHIELD,
            ItemID.STEEL_SQ_SHIELD,
            ItemID.BLACK_SQ_SHIELD,
            ItemID.WHITE_SQ_SHIELD,
            ItemID.MITHRIL_SQ_SHIELD,
            ItemID.ADAMANT_SQ_SHIELD,
            ItemID.RUNE_SQ_SHIELD,
            ItemID.DRAGON_SQ_SHIELD,
            ItemID.DRAGON_SQ_SHIELD_G,
            ItemID.GILDED_SQ_SHIELD,
            ItemID.ANTIDRAGON_SHIELD,
            ItemID.ANTIDRAGON_SHIELD_8282,
            ItemID.ANTIDRAGON_SHIELD_NZ,

            // kite shields
            ItemID.BRONZE_KITESHIELD,
            ItemID.BRONZE_KITESHIELD_G,
            ItemID.BRONZE_KITESHIELD_T,
            ItemID.IRON_KITESHIELD,
            ItemID.IRON_KITESHIELD_G,
            ItemID.IRON_KITESHIELD_T,
            ItemID.STEEL_KITESHIELD,
            ItemID.STEEL_KITESHIELD_G,
            ItemID.STEEL_KITESHIELD_T,
            ItemID.BLACK_KITESHIELD,
            ItemID.BLACK_KITESHIELD_G,
            ItemID.BLACK_KITESHIELD_T,
            ItemID.WHITE_KITESHIELD,
            ItemID.MITHRIL_KITESHIELD,
            ItemID.MITHRIL_KITESHIELD_G,
            ItemID.MITHRIL_KITESHIELD_T,
            ItemID.ADAMANT_KITESHIELD,
            ItemID.ADAMANT_KITESHIELD_G,
            ItemID.ADAMANT_KITESHIELD_T,
            ItemID.RUNE_KITESHIELD,
            ItemID.RUNE_KITESHIELD_G,
            ItemID.RUNE_KITESHIELD_T,
            ItemID.DRAGON_KITESHIELD,
            ItemID.DRAGON_KITESHIELD_G,
            ItemID.GILDED_KITESHIELD,

            // ranging shields
            ItemID.OAK_SHIELD,
            ItemID.WILLOW_SHIELD,
            ItemID.MAPLE_SHIELD,
            ItemID.YEW_SHIELD,
            ItemID.MAGIC_SHIELD,
            ItemID.REDWOOD_SHIELD,
            ItemID.HARD_LEATHER_SHIELD,
            ItemID.SNAKESKIN_SHIELD,
            ItemID.GREEN_DHIDE_SHIELD,
            ItemID.BLUE_DHIDE_SHIELD,
            ItemID.RED_DHIDE_SHIELD,
            ItemID.BLACK_DHIDE_SHIELD,
            ItemID.ANCIENT_DHIDE_SHIELD,
            ItemID.ARMADYL_DHIDE_SHIELD,
            ItemID.BANDOS_DHIDE_SHIELD,
            ItemID.GUTHIX_DHIDE_SHIELD,
            ItemID.SARADOMIN_DHIDE_SHIELD,
            ItemID.ZAMORAK_DHIDE_SHIELD,

            ItemID.CABBAGE_ROUND_SHIELD,
            ItemID.DEFENSIVE_SHIELD,
            // ItemID.ELEMENTAL_SHIELD, (pretty sure pure magic def doesn't count)
            ItemID.FALADOR_SHIELD,
            ItemID.FALADOR_SHIELD_1,
            ItemID.FALADOR_SHIELD_2,
            ItemID.FALADOR_SHIELD_3,
            ItemID.FALADOR_SHIELD_4,
            ItemID.FREMENNIK_SHIELD,
            // frem round shield id
            ItemID.GRANITE_SHIELD,
            ItemID.MALEDICTION_WARD,
            ItemID.MALEDICTION_WARD_12806,
            // ItemID.MIND_SHIELD,  (pretty sure pure magic def doesn't count)
            ItemID.MIRROR_SHIELD,
            // ItemID.ODIUM_WARD,   (pretty sure pure magic def doesn't count)
            // ItemID.ODIUM_WARD_12807,
            ItemID.TOKTZKETXIL,
            ItemID.TWISTED_BUCKLER,
            ItemID.WOODEN_SHIELD,
            ItemID.WOODEN_SHIELD_7676,
            ItemID.WOODEN_SHIELD_G,
            ItemID.BROODOO_SHIELD,
            ItemID.CRYSTAL_SHIELD,
            ItemID.SPIRIT_SHIELD,
            ItemID.SPIRIT_SHIELD_23599,
            ItemID.BLESSED_SPIRIT_SHIELD_23642,
            ItemID.ELYSIAN_SPIRIT_SHIELD_19559,
            ItemID.ARCANE_SPIRIT_SHIELD,
            ItemID.SPECTRAL_SPIRIT_SHIELD,
            ItemID.DRAGONFIRE_SHIELD,
            ItemID.DRAGONFIRE_SHIELD_11284,
            ItemID.ANCIENT_WYVERN_SHIELD,
            ItemID.ANCIENT_WYVERN_SHIELD_21634,
            ItemID.DRAGONFIRE_WARD,
            ItemID.DRAGONFIRE_WARD_22003,
            ItemID.DINHS_BULWARK
            // defenders next but they don't have an effect acc to testing

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
