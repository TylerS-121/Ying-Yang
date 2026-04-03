
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.tyler.yingyang.init;

import net.tyler.yingyang.entity.BloodblyatEntity;
import net.tyler.yingyang.YingyangMod;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;

public class YingyangModEntities {
	public static EntityType<BloodblyatEntity> BLOODBLYAT;

	public static void load() {
		BLOODBLYAT = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(YingyangMod.MODID, "bloodblyat"), createArrowEntityType(BloodblyatEntity::new));
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return FabricEntityTypeBuilder.create(MobCategory.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(1).trackedUpdateRate(64).build();
	}
}
