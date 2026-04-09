/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.tyler.yingyang.init;

import net.tyler.yingyang.client.particle.UltimateBB8Particle;
import net.tyler.yingyang.client.particle.RiftAuraParticle;
import net.tyler.yingyang.client.particle.MusicParticle;
import net.tyler.yingyang.client.particle.MkParticle;
import net.tyler.yingyang.client.particle.BloodsmalParticle;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;

public class YingyangModParticleTypes {
	public static final SimpleParticleType MK = FabricParticleTypes.simple(false);
	public static final SimpleParticleType BLOODSMAL = FabricParticleTypes.simple(true);
	public static final SimpleParticleType ULTIMATE_BB_8 = FabricParticleTypes.simple(false);
	public static final SimpleParticleType MUSIC = FabricParticleTypes.simple(false);
	public static final SimpleParticleType RIFT_AURA = FabricParticleTypes.simple(false);

	public static void clientLoad() {
		ParticleFactoryRegistry.getInstance().register(MK, MkParticle::provider);
		ParticleFactoryRegistry.getInstance().register(BLOODSMAL, BloodsmalParticle::provider);
		ParticleFactoryRegistry.getInstance().register(ULTIMATE_BB_8, UltimateBB8Particle::provider);
		ParticleFactoryRegistry.getInstance().register(MUSIC, MusicParticle::provider);
		ParticleFactoryRegistry.getInstance().register(RIFT_AURA, RiftAuraParticle::provider);
	}

	public static void load() {
		Registry.register(BuiltInRegistries.PARTICLE_TYPE, new ResourceLocation("yingyang", "mk"), MK);
		Registry.register(BuiltInRegistries.PARTICLE_TYPE, new ResourceLocation("yingyang", "bloodsmal"), BLOODSMAL);
		Registry.register(BuiltInRegistries.PARTICLE_TYPE, new ResourceLocation("yingyang", "ultimate_bb_8"), ULTIMATE_BB_8);
		Registry.register(BuiltInRegistries.PARTICLE_TYPE, new ResourceLocation("yingyang", "music"), MUSIC);
		Registry.register(BuiltInRegistries.PARTICLE_TYPE, new ResourceLocation("yingyang", "rift_aura"), RIFT_AURA);
	}
}
