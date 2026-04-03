package net.tyler.yingyang.procedures;

import net.tyler.yingyang.init.YingyangModParticleTypes;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.SimpleParticleType;

public class ThelostArtifactItemInInventoryTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double particleRadius = 0;
		double particleAmount = 0;
		particleAmount = 8;
		particleRadius = 2;
		for (int index0 = 0; index0 < (int) particleAmount; index0++) {
			world.addParticle((SimpleParticleType) (YingyangModParticleTypes.BLOODSMAL), (x + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius), (y + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius),
					(z + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius), (Mth.nextDouble(RandomSource.create(), -0.001, 0.001)), (Mth.nextDouble(RandomSource.create(), -0.001, 0.001)),
					(Mth.nextDouble(RandomSource.create(), -0.001, 0.001)));
		}
		particleAmount = 4;
		particleRadius = 4;
		for (int index1 = 0; index1 < (int) particleAmount; index1++) {
			world.addParticle((SimpleParticleType) (YingyangModParticleTypes.BLOODSMAL), (x + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius), (y + 0 + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)),
					(z + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius), 0, 0, 0);
		}
	}
}
