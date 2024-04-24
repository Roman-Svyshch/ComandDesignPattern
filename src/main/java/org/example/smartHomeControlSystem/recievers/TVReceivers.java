package org.example.smartHomeControlSystem.recievers;

import org.example.comandLightRemoteControl.RemoteControl;

public class TVReceivers {
    private String name;
    private RemoteControl remoteControl;

    public TVReceivers() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public TVReceivers(String name) {
        this.name = name;
    }

    public void turnNextChannel(){
        System.out.println(name + " you switch to the next channel ");
    }

    public void turnButtonPrevChannel(){
        System.out.println(" you switch to the next channel ");
    }
    public void addVolume(){
        System.out.println(name + "Adding volume + 1");
    }
    public void turnDownVolume(){
        System.out.println(name + "Turn Down volume - 1");
    }
}
