package mcid.anubisset.letsmodreboot.client.gui;

import cpw.mods.fml.client.config.GuiConfig;
import mcid.anubisset.letsmodreboot.handler.ConfigurationHandler;
import mcid.anubisset.letsmodreboot.reference.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.ConfigElement;

import java.util.List;

/**
 * Created by Luke on 27/08/2014.
 */
public class ModGuiConfig extends GuiConfig
{
    public ModGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
