package net.tyler.yingyang.procedures;

import net.tyler.yingyang.YingyangMod;

public class ThelostArtifactLivingEntityIsHitWithItemProcedure {
	public static void execute() {
		double onoff = 0;
		YingyangMod.LOGGER.info(onoff);
		if (onoff == 0) {
			onoff = onoff + 1;
		}
		if (onoff == 1) {
			onoff = onoff - 1;
		}
	}
}
