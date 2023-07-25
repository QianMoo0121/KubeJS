package dev.latvian.mods.kubejs.core.mixin.common.tools.shears;

import dev.latvian.mods.kubejs.item.custom.ShearsItemBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.PumpkinBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({PumpkinBlock.class, BeehiveBlock.class})
public abstract class BlockInteractShearsMixin {
    @Redirect(at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;is(Lnet/minecraft/world/item/Item;)Z"), method = "use")
    private boolean isShears(ItemStack stack, Item item) {
        return ShearsItemBuilder.SHEARS_LIST.contains(stack.getItem()) || stack.is(item);
    }
}