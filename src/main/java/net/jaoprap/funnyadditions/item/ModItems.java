package net.jaoprap.funnyadditions.item;

import net.jaoprap.funnyadditions.FunnyAdditions;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister.Items ITEMS_REGISTER = DeferredRegister.createItems(FunnyAdditions.MODID);

    public static final Supplier<Item> AMOGUS_ESSENCE = ITEMS_REGISTER.registerSimpleItem("amogus_essence");

    public static void register(IEventBus eventBus) {
        ITEMS_REGISTER.register(eventBus);
    }
}
