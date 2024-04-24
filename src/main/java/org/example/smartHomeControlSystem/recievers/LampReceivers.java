package org.example.smartHomeControlSystem.recievers;

public class LampReceivers {
    private String name;

    public LampReceivers(String name) {
        this.name = name;
    }

    public void switchOnLight(){
        System.out.println(name + "Switch ON Light");
    }
    public void switchOFFLight(){
        System.out.println(name + "Switch OFF Light");
    }
}
