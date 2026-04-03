package net.tyler.yingyang.procedures;

import net.tyler.yingyang.init.YingyangModItems;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class GreatswordsteelRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == YingyangModItems.CONFUSED_ORE) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 1));
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == YingyangModItems.HALF_CONFUSED_INGOT) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 2, 1));
		}
	}
}
