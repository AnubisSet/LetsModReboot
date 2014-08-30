package mcid.anubisset.letsmodreboot.init;

import cpw.mods.fml.common.registry.GameRegistry;
import mcid.anubisset.letsmodreboot.item.ItemLMRB;
import mcid.anubisset.letsmodreboot.item.ItemMapleLeaf;

/**
 * Created by Luke on 29/08/2014.
 */
public class ModItems
{
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
