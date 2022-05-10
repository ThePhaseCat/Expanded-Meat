
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.expandedmeat.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.expandedmeat.item.StriderMeatItem;
import net.mcreator.expandedmeat.item.SquidMeatItem;
import net.mcreator.expandedmeat.item.ShulkerMeatItem;
import net.mcreator.expandedmeat.item.GlowSquidMeatItem;
import net.mcreator.expandedmeat.item.DrownedMeatItem;
import net.mcreator.expandedmeat.item.BlazeMeatItem;
import net.mcreator.expandedmeat.item.BeeMeatItem;
import net.mcreator.expandedmeat.ExpandedMeatMod;

public class ExpandedMeatModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ExpandedMeatMod.MODID);
	public static final RegistryObject<Item> BLAZE_MEAT = REGISTRY.register("blaze_meat", () -> new BlazeMeatItem());
	public static final RegistryObject<Item> DROWNED_MEAT = REGISTRY.register("drowned_meat", () -> new DrownedMeatItem());
	public static final RegistryObject<Item> SHULKER_MEAT = REGISTRY.register("shulker_meat", () -> new ShulkerMeatItem());
	public static final RegistryObject<Item> GLOW_SQUID_MEAT = REGISTRY.register("glow_squid_meat", () -> new GlowSquidMeatItem());
	public static final RegistryObject<Item> STRIDER_MEAT = REGISTRY.register("strider_meat", () -> new StriderMeatItem());
	public static final RegistryObject<Item> SQUID_MEAT = REGISTRY.register("squid_meat", () -> new SquidMeatItem());
	public static final RegistryObject<Item> BEE_MEAT = REGISTRY.register("bee_meat", () -> new BeeMeatItem());
}
