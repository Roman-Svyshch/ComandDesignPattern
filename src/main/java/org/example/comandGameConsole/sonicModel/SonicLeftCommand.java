package org.example.comandGameConsole.sonicModel;

import org.example.comandGameConsole.gameInterface.Command;
import org.example.comandGameConsole.sonicReceiver.SonicCharacterReceiver;

public class SonicLeftCommand implements Command {
    private SonicCharacterReceiver receiver;
    @Override
    public void execute() {
        receiver.moveLeft();
    }
}
