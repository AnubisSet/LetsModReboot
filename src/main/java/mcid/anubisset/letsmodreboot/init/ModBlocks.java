package mcid.anubisset.letsmodreboot.init;

import cpw.mods.fml.common.registry.GameRegistry;
import mcid.anubisset.letsmodreboot.block.BlockFlag;
import mcid.anubisset.letsmodreboot.block.BlockLMRB;
import mcid.anubisset.letsmodreboot.reference.Reference;

/**
 * Created by Luke on 30/08/2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLMRB flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}
