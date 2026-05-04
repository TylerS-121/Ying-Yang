package net.tyler.yingyang.procedures;

import net.tyler.yingyang.init.YingyangModParticleTypes;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

public class ThelostArtifactItemInInventoryTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double particleRadius = 0;
		double particleAmount = 0;
		double onoff = 0;
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.SMOOTH_STONE) {
			if (onoff == 1) {
				onoff = 0;
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.DEEPSLATE) {
			if (onoff == 0) {
				onoff = 1;
			}
		}
		if (onoff == 0) {
			for (int index0 = 0; index0 < 8; index0++) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (YingyangModParticleTypes.BLOODSMAL), x, (y + 0.8), z, 1, 0.1, 0.1, 0.1, 0.1);
			}
		}
		for (int index1 = 0; index1 < 999; index1++) {
			if (onoff == 1) {
				onoff = 1;
			}
		}
	}
}
