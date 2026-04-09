
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.tyler.yingyang.init;

import net.tyler.yingyang.enchantment.DeathEnchantment;
import net.tyler.yingyang.enchantment.BleedingEnchantment;
import net.tyler.yingyang.YingyangMod;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class YingyangModEnchantments {
	public static Enchantment BLEEDING;
	public static Enchantment DEATH;

	public static void load() {
		BLEEDING = Registry.register(BuiltInRegistries.ENCHANTMENT, new ResourceLocation(YingyangMod.MODID, "bleeding"), new BleedingEnchantment());
		DEATH = Registry.register(BuiltInRegistries.ENCHANTMENT, new ResourceLocation(YingyangMod.MODID, "death"), new DeathEnchantment());
	}
}
