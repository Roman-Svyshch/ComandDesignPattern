package org.example.smartHomeControlSystem.lampModels;

import org.example.smartHomeControlSystem.comandInterface.Command;
import org.example.smartHomeControlSystem.recievers.LampReceivers;

public class LampSwitchOn implements Command {

    private LampReceivers receivers;

    public LampSwitchOn(LampReceivers receivers) {
        this.receivers = receivers;
    }

    @Override
    public void execute() {
        receivers.switchOnLight();
    }
}
