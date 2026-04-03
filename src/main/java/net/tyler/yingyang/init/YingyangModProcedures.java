
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.tyler.yingyang.init;

import net.tyler.yingyang.procedures.V8ybyv8bsCharmItemInInventoryTickProcedure;
import net.tyler.yingyang.procedures.UltimateBB8sCharmItemInInventoryTickProcedure;
import net.tyler.yingyang.procedures.ThelostArtifactItemInInventoryTickProcedure;
import net.tyler.yingyang.procedures.SickleRightclickedProcedure;
import net.tyler.yingyang.procedures.MagikAuraItemInInventoryTickProcedure;
import net.tyler.yingyang.procedures.HungeryRightclickedOnBlockProcedure;
import net.tyler.yingyang.procedures.GreatswordsteelRightclickedProcedure;
import net.tyler.yingyang.procedures.GreatswordsteelLivingEntityIsHitWithToolProcedure;
import net.tyler.yingyang.procedures.DissapearanceLivingEntityIsHitWithItemProcedure;
import net.tyler.yingyang.procedures.CharmSummonerRightclickedOnBlockProcedure;
import net.tyler.yingyang.procedures.BloodblyatWhileProjectileFlyingTickProcedure;
import net.tyler.yingyang.procedures.AbsoluteAltercationToolInInventoryTickProcedure;
import net.tyler.yingyang.procedures.AbsoluteAltercationRightclickedProcedure;
import net.tyler.yingyang.procedures.AbsoluteAltercationLivingEntityIsHitWithToolProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class YingyangModProcedures {
	public static void load() {
		new BloodblyatWhileProjectileFlyingTickProcedure();
		new SickleRightclickedProcedure();
		new GreatswordsteelLivingEntityIsHitWithToolProcedure();
		new GreatswordsteelRightclickedProcedure();
		new AbsoluteAltercationLivingEntityIsHitWithToolProcedure();
		new AbsoluteAltercationRightclickedProcedure();
		new HungeryRightclickedOnBlockProcedure();
		new ThelostArtifactItemInInventoryTickProcedure();
		new AbsoluteAltercationToolInInventoryTickProcedure();
		new DissapearanceLivingEntityIsHitWithItemProcedure();
		new MagikAuraItemInInventoryTickProcedure();
		new UltimateBB8sCharmItemInInventoryTickProcedure();
		new V8ybyv8bsCharmItemInInventoryTickProcedure();
		new CharmSummonerRightclickedOnBlockProcedure();
	}
}
