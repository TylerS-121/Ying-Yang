package net.tyler.yingyang.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

public class CleaveprojProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 200);
		new Object() {
			private int ticks = 0;

			public void startDelay(LevelAccessor world) {
				ServerTickEvents.END_SERVER_TICK.register((server) -> {
					this.ticks++;
					if (this.ticks == 5) {
						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("yingyang:blood_gone")))), 2);
						new Object() {
							private int ticks = 0;

							public void startDelay(LevelAccessor world) {
								ServerTickEvents.END_SERVER_TICK.register((server) -> {
									this.ticks++;
									if (this.ticks == 10) {
										entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("yingyang:blood_gone")))), 3);
										new Object() {
											private int ticks = 0;

											public void startDelay(LevelAccessor world) {
												ServerTickEvents.END_SERVER_TICK.register((server) -> {
													this.ticks++;
													if (this.ticks == 10) {
														entity.hurt(new DamageSource(
																world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("yingyang:blood_gone")))), 2);
														new Object() {
															private int ticks = 0;

															public void startDelay(LevelAccessor world) {
																ServerTickEvents.END_SERVER_TICK.register((server) -> {
																	this.ticks++;
																	if (this.ticks == 10) {
																		entity.hurt(new DamageSource(
																				world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("yingyang:blood_gone")))),
																				3);
																		new Object() {
																			private int ticks = 0;

																			public void startDelay(LevelAccessor world) {
																				ServerTickEvents.END_SERVER_TICK.register((server) -> {
																					this.ticks++;
																					if (this.ticks == 10) {
																						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE)
																								.getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("yingyang:blood_gone")))), 2);
																						new Object() {
																							private int ticks = 0;

																							public void startDelay(LevelAccessor world) {
																								ServerTickEvents.END_SERVER_TICK.register((server) -> {
																									this.ticks++;
																									if (this.ticks == 20) {
																										entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE)
																												.getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("yingyang:blood_gone")))), 3);
																										new Object() {
																											private int ticks = 0;

																											public void startDelay(LevelAccessor world) {
																												ServerTickEvents.END_SERVER_TICK.register((server) -> {
																													this.ticks++;
																													if (this.ticks == 10) {
																														entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE)
																																.getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("yingyang:blood_gone")))), 2);
																														new Object() {
																															private int ticks = 0;

																															public void startDelay(LevelAccessor world) {
																																ServerTickEvents.END_SERVER_TICK.register((server) -> {
																																	this.ticks++;
																																	if (this.ticks == 10) {
																																		entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(
																																				ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("yingyang:blood_gone")))), 3);
																																		new Object() {
																																			private int ticks = 0;

																																			public void startDelay(LevelAccessor world) {
																																				ServerTickEvents.END_SERVER_TICK.register((server) -> {
																																					this.ticks++;
																																					if (this.ticks == 10) {
																																						entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE)
																																								.getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE,
																																										new ResourceLocation("yingyang:blood_gone")))),
																																								2);
																																						new Object() {
																																							private int ticks = 0;

																																							public void startDelay(LevelAccessor world) {
																																								ServerTickEvents.END_SERVER_TICK.register((server) -> {
																																									this.ticks++;
																																									if (this.ticks == 10) {
																																										entity.hurt(
																																												new DamageSource(
																																														world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE)
																																																.getHolderOrThrow(ResourceKey.create(
																																																		Registries.DAMAGE_TYPE,
																																																		new ResourceLocation("yingyang:blood_gone")))),
																																												3);
																																										return;
																																									}
																																								});
																																							}
																																						}.startDelay(world);
																																						return;
																																					}
																																				});
																																			}
																																		}.startDelay(world);
																																		return;
																																	}
																																});
																															}
																														}.startDelay(world);
																														return;
																													}
																												});
																											}
																										}.startDelay(world);
																										return;
																									}
																								});
																							}
																						}.startDelay(world);
																						return;
																					}
																				});
																			}
																		}.startDelay(world);
																		return;
																	}
																});
															}
														}.startDelay(world);
														return;
													}
												});
											}
										}.startDelay(world);
										return;
									}
								});
							}
						}.startDelay(world);
						return;
					}
				});
			}
		}.startDelay(world);
	}
}
