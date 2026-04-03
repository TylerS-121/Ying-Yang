package net.tyler.yingyang.procedures;

import net.tyler.yingyang.init.YingyangModParticleTypes;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

public class BloodblyatWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (YingyangModParticleTypes.BLOODSMAL), x, y, z, 3, 1, 1, 1, 3);
	}
}
