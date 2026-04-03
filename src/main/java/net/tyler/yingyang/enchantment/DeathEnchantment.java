
package net.tyler.yingyang.enchantment;

import net.tyler.yingyang.init.YingyangModItems;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

public class DeathEnchantment extends Enchantment {
	public DeathEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.COMMON, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public boolean canEnchant(ItemStack itemstack) {
		return Ingredient.of(new ItemStack(YingyangModItems.ABSOLUTE_ALTERCATION)).test(itemstack);
	}
}
