package dev.latvian.mods.kubejs.holder;

import dev.latvian.mods.kubejs.KubeJS;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.holdersets.HolderSetType;

public interface KubeJSHolderSets {
	DeferredRegister<HolderSetType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.Keys.HOLDER_SET_TYPES, KubeJS.MOD_ID);

	// FIXME: Implement more holder set types - regex, namespace
	// Holder<HolderSetType> REGEX = REGISTRY.register("regex", () -> RegExHolderSet::codec);
	// Holder<HolderSetType> NAMESPACE = REGISTRY.register("namespace", () -> NamespaceHolderSet::codec);
}
