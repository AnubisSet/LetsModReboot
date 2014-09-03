package mcid.anubisset.letsmodreboot.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import mcid.anubisset.letsmodreboot.client.settings.Keybindings;
import net.minecraft.client.settings.KeyBinding;

/**
 * Created by Luke on 26/08/2014.
 */
public class ClientProxy extends CommonProxy
{
    @Override
    public void registerKeyBindings()
    {
        ClientRegistry.registerKeyBinding(Keybindings.charge);
        ClientRegistry.registerKeyBinding(Keybindings.release);
    }
}
