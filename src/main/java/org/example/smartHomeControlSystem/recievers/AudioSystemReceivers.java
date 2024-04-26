package org.example.smartHomeControlSystem.recievers;


import org.example.smartHomeControlSystem.invoker.RemoteControllerSmartHome;

public class AudioSystemReceivers {
    private String name;

    private RemoteControllerSmartHome remoteControl;

    public AudioSystemReceivers(String name) {
        this.name = name;
    }

    public void addVolume(){
        System.out.println(name + "Adding volume + 1");
    }
    public void turnDownVolume(){
        System.out.println(name + "Turn Down volume - 1");
    }
}
