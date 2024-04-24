package org.example.smartHomeControlSystem.lampModels;

import org.example.smartHomeControlSystem.comandInterface.Command;
import org.example.smartHomeControlSystem.recievers.LampReceivers;

public class LampSwitchOFF implements Command {
    private LampReceivers receivers;
    public LampSwitchOFF (LampReceivers receivers){
        this.receivers = receivers;
    }
    @Override
    public void execute() {
     receivers.switchOFFLight();
    }
}
