package org.example.comandLightRemoteControl;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void pressButton(){
        command.execute();
    }
}
