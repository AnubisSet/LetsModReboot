package mcid.anubisset.letsmodreboot.client.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import mcid.anubisset.letsmodreboot.client.settings.Keybindings;
import mcid.anubisset.letsmodreboot.reference.Key;
import mcid.anubisset.letsmodreboot.utility.LogHelper;

/**
 * Created by Luke on 03/09/2014.
 */
public class KeyInputEventHandler
{
    private static Key getPressedKeybinding()
    {
        if (Keybindings.charge.isPressed())
        {
            return Key.CHARGE;
        }
        else if (Keybindings.release.isPressed())
        {
            return Key.RELEASE;
        }

        return Key.UNKNOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
    {
        LogHelper.info(getPressedKeybinding());
    }
}
