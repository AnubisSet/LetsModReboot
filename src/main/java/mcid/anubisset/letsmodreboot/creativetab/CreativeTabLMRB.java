package mcid.anubisset.letsmodreboot.creativetab;

import mcid.anubisset.letsmodreboot.init.ModItems;
import mcid.anubisset.letsmodreboot.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Luke on 30/08/2014.
 */
public class CreativeTabLMRB
{
    public static final CreativeTabs LMRB_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.mapleLeaf;
        }
    };
}
