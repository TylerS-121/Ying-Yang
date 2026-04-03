package net.tyler.yingyang.procedures;

import net.tyler.yingyang.init.YingyangModParticleTypes;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

public class V8ybyv8bsCharmItemInInventoryTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double particleRadius = 0;
		double particleAmount = 0;
		particleAmount = 1;
		particleRadius = 1;
		for (int index0 = 0; index0 < (int) particleAmount; index0++) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (YingyangModParticleTypes.MUSIC), x, y, z, 1, 0.1, 0.1, 0.1, 0.1);
		}
	}
}
