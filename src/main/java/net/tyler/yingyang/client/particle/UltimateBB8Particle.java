
package net.tyler.yingyang.client.particle;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.particle.TextureSheetParticle;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.multiplayer.ClientLevel;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class UltimateBB8Particle extends TextureSheetParticle {
	public static UltimateBB8ParticleProvider provider(SpriteSet spriteSet) {
		return new UltimateBB8ParticleProvider(spriteSet);
	}

	public static class UltimateBB8ParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public UltimateBB8ParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			return new UltimateBB8Particle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	protected UltimateBB8Particle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;
		this.setSize((float) 0.2, (float) 0.2);
		this.quadSize *= (float) 1;
		this.lifetime = 7;
		this.gravity = (float) 0;
		this.hasPhysics = true;
		this.xd = vx * 1;
		this.yd = vy * 1;
		this.zd = vz * 1;
		this.pickSprite(spriteSet);
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
	}

	@Override
	public void tick() {
		super.tick();
	}
}
