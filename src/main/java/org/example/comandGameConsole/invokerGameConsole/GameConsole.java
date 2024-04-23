package org.example.comandGameConsole.invokerGameConsole;

import org.example.comandGameConsole.gameInterface.Command;

public class GameConsole {
    private Command UpCommand;
    private Command DownCommand;
    private Command LeftCommand;
    private Command RightCommand;

    public GameConsole(Command upCommand, Command downCommand, Command leftCommand, Command rightCommand) {
        UpCommand = upCommand;
        DownCommand = downCommand;
        LeftCommand = leftCommand;
        RightCommand = rightCommand;
    }

    public  void arrowUp(){
        UpCommand.execute();
    }
    public  void arrowDown(){
        DownCommand.execute();
    }
    public  void arrowLeft(){
        LeftCommand.execute();
    }
    public  void arrowRight(){
        RightCommand.execute();
    }
}
