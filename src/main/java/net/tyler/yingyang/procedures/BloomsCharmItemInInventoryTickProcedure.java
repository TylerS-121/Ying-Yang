package net.tyler.yingyang.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class BloomsCharmItemInInventoryTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double particleRadius = 0;
		double particleAmount = 0;
		particleAmount = 1;
		particleRadius = 1;
		for (int index0 = 0; index0 < (int) particleAmount; index0++) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CHERRY_LEAVES, x, (y + 1), z, 1, 0.1, 0.1, 0.1, 0.1);
		}
	}
}
