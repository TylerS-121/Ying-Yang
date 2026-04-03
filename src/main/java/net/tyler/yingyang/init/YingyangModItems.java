/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.tyler.yingyang.init;

import net.tyler.yingyang.item.V8ybyv8bsCharmItem;
import net.tyler.yingyang.item.UltimateBB8sCharmItem;
import net.tyler.yingyang.item.ThelostArtifactItem;
import net.tyler.yingyang.item.SpecialAxeItem;
import net.tyler.yingyang.item.SickleItem;
import net.tyler.yingyang.item.MagikAuraItem;
import net.tyler.yingyang.item.HalfConfusedIngotItem;
import net.tyler.yingyang.item.GreatswordsteelItem;
import net.tyler.yingyang.item.DissapearanceItem;
import net.tyler.yingyang.item.ConfusedOreItem;
import net.tyler.yingyang.item.CharmSummonerItem;
import net.tyler.yingyang.item.BlooditemHOWUGOTTSItem;
import net.tyler.yingyang.item.AbsoluteAltercationItem;
import net.tyler.yingyang.YingyangMod;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;

public class YingyangModItems {
	public static Item SICKLE;
	public static Item CONFUSED_ORE;
	public static Item BLOODITEM_HOWUGOTTS;
	public static Item HALF_CONFUSED_INGOT;
	public static Item SPECIAL_AXE;
	public static Item GREATSWORDSTEEL;
	public static Item ABSOLUTE_ALTERCATION;
	public static Item THELOST_ARTIFACT;
	public static Item DISSAPEARANCE;
	public static Item MAGIK_AURA;
	public static Item ULTIMATE_BB_8S_CHARM;
	public static Item V_8YBYV_8BS_CHARM;
	public static Item CHARM_SUMMONER;

	public static void load() {
		SICKLE = register("sickle", new SickleItem());
		CONFUSED_ORE = register("confused_ore", new ConfusedOreItem());
		BLOODITEM_HOWUGOTTS = register("blooditem_howugotts", new BlooditemHOWUGOTTSItem());
		HALF_CONFUSED_INGOT = register("half_confused_ingot", new HalfConfusedIngotItem());
		SPECIAL_AXE = register("special_axe", new SpecialAxeItem());
		GREATSWORDSTEEL = register("greatswordsteel", new GreatswordsteelItem());
		ABSOLUTE_ALTERCATION = register("absolute_altercation", new AbsoluteAltercationItem());
		THELOST_ARTIFACT = register("thelost_artifact", new ThelostArtifactItem());
		DISSAPEARANCE = register("dissapearance", new DissapearanceItem());
		MAGIK_AURA = register("magik_aura", new MagikAuraItem());
		ULTIMATE_BB_8S_CHARM = register("ultimate_bb_8s_charm", new UltimateBB8sCharmItem());
		V_8YBYV_8BS_CHARM = register("v_8ybyv_8bs_charm", new V8ybyv8bsCharmItem());
		CHARM_SUMMONER = register("charm_summoner", new CharmSummonerItem());
	}

	public static void clientLoad() {
	}

	private static Item register(String registryName, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(YingyangMod.MODID, registryName), item);
	}

	private static void registerBlockingProperty(Item item) {
		ItemProperties.register(item, new ResourceLocation("blocking"), (ClampedItemPropertyFunction) ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
	}
}
