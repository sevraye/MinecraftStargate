package com.sevraye.minecraftstargate.client.handler;

import com.sevraye.minecraftstargate.client.settings.Keybindings;
import com.sevraye.minecraftstargate.reference.Key;
import com.sevraye.minecraftstargate.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler
{
    private static Key getPresssedKeybinding()
    {
        if(Keybindings.charge.isPressed()){
            return Key.CHARGE;
        }
        else if(Keybindings.release.isPressed())
        {
            return Key.RELEASE;
        }
        return Key.UNKNOWN;
    }

    @SubscribeEvent
    public void handlerKeyInputEvent(InputEvent.KeyInputEvent event)
    {
        LogHelper.info(getPresssedKeybinding());
    }
}
