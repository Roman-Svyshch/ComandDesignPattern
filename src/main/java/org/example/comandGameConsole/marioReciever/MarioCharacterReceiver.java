package org.example.comandGameConsole.marioReciever;

import org.example.comandGameConsole.invokerGameConsole.GameConsole;

public class MarioCharacterReceiver {
    private String name;

     private GameConsole gameConsole;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void moveUp(){
        System.out.println(name + "Move Up");
    }
    public void moveDown(){
        System.out.println(name + " Move Down");
    }
    public void moveRight(){
        System.out.println(name + "Move Right");
       }
    public void moveLeft(){
        System.out.println(name + "Move Left");
    }
}
