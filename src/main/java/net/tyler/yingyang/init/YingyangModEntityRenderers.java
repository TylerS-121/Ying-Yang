
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.tyler.yingyang.init;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class YingyangModEntityRenderers {
	public static void load() {
		EntityRendererRegistry.register(YingyangModEntities.BLOODBLYAT, ThrownItemRenderer::new);
	}
}
