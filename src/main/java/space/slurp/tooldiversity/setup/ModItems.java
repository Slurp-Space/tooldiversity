package space.slurp.tooldiversity.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class ModItems {
    public static final RegistryObject<Item> GRAPHITE_POWDER = Registration.ITEMS.register("graphite_powder", () ->
            new Item(new Item.Properties()
                    .group(ItemGroup.MATERIALS)
            )
    );

    static void register() {}
}
