package org.example.comandGameConsole.sonicModel;

import org.example.comandGameConsole.gameInterface.Command;
import org.example.comandGameConsole.sonicReceiver.SonicCharacterReceiver;

public class SonicRightCommand implements Command {
    private SonicCharacterReceiver receiver;
    @Override
    public void execute() {
    receiver.moveRight();
    }
}
