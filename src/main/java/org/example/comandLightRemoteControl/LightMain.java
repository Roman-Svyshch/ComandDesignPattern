package org.example.comandLightRemoteControl;

public class LightMain {
    public static void main(String[] args) {
        Light light = new Light();

        Command lightOnCommand  = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();
    }
}
