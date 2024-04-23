package org.example.comandGameConsole.marioModel;

import org.example.comandGameConsole.gameInterface.Command;
import org.example.comandGameConsole.marioReciever.MarioCharacterReceiver;

public class MarioRightCommand implements Command {
    private MarioCharacterReceiver marioCharacter;

    public MarioRightCommand(MarioCharacterReceiver marioCharacter) {
        this.marioCharacter = marioCharacter;
    }

    @Override
    public void execute() {
        marioCharacter.moveRight();
    }
}
