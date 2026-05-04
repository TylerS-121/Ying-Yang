
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.tyler.yingyang.init;

import net.tyler.yingyang.client.model.Modelcleavemodel_Converted;

import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityModelLayerRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class YingyangModModels {
	public static void load() {
		EntityModelLayerRegistry.registerModelLayer(Modelcleavemodel_Converted.LAYER_LOCATION, Modelcleavemodel_Converted::createBodyLayer);
	}
}
