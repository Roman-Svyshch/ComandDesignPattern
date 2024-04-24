package org.example.comandLightRemoteControl;

import org.example.smartHomeControlSystem.tvModels.TVTurnDownVolume;
import org.example.smartHomeControlSystem.tvModels.TVUpVolume;
import org.example.smartHomeControlSystem.tvModels.TurnNextChannel;
import org.example.smartHomeControlSystem.tvModels.TurnPreviousChannel;

public class RemoteControl {
    private Command command;


    public void setCommand(Command command) {
        this.command = command;
    }
    public void pressButton(){
        command.execute();
    }
}
