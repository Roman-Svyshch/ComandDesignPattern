package org.example.comandGameConsole;

import org.example.comandGameConsole.invokerGameConsole.GameConsole;
import org.example.comandGameConsole.marioModel.MarioDownCommand;
import org.example.comandGameConsole.marioModel.MarioLeftCommand;
import org.example.comandGameConsole.marioModel.MarioRightCommand;
import org.example.comandGameConsole.marioModel.MarioUpCommand;
import org.example.comandGameConsole.marioReciever.MarioCharacterReceiver;
import org.example.comandGameConsole.sonicModel.SonicDownCommand;
import org.example.comandGameConsole.sonicModel.SonicLeftCommand;
import org.example.comandGameConsole.sonicModel.SonicRightCommand;
import org.example.comandGameConsole.sonicModel.SonicUpCommand;
import org.example.comandGameConsole.sonicReceiver.SonicCharacterReceiver;

public class Main {
    public static void main(String[] args) {
        MarioCharacterReceiver mario = new MarioCharacterReceiver();
        SonicCharacterReceiver sonic = new SonicCharacterReceiver();
        sonic.setName("Sonic");
        mario.setName("Mario ");



        MarioUpCommand marioUpCommand = new MarioUpCommand(mario);
        MarioDownCommand marioDownCommand = new MarioDownCommand(mario);
        MarioLeftCommand marioLeftCommand = new MarioLeftCommand(mario);
        MarioRightCommand marioRightCommand = new MarioRightCommand(mario);

        SonicRightCommand sonicRightCommand = new SonicRightCommand();
        SonicDownCommand sonicDownCommand = new SonicDownCommand();
        SonicLeftCommand sonicLeftCommand = new SonicLeftCommand();
        SonicUpCommand sonicUpCommand = new SonicUpCommand();

        GameConsole gameConsole = new GameConsole(marioUpCommand,marioDownCommand,marioLeftCommand,marioRightCommand);
        GameConsole gameSonic = new GameConsole(sonicUpCommand,sonicDownCommand,sonicLeftCommand,sonicRightCommand);


        gameConsole.arrowLeft();
        gameConsole.arrowRight();
        gameConsole.arrowDown();
        gameConsole.arrowUp();

        System.out.println("======================================");

        sonic.moveRight();
        sonic.moveLeft();
        sonic.moveUp();
        sonic.moveDown();

    }
}
