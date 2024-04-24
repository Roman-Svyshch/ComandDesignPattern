package org.example.smartHomeControlSystem.tvModels;

import org.example.smartHomeControlSystem.comandInterface.Command;
import org.example.smartHomeControlSystem.recievers.TVReceivers;

public class TurnNextChannel implements Command {
    private TVReceivers receivers;

    public TurnNextChannel(TVReceivers receivers) {
        this.receivers = receivers;
    }

    @Override
    public void execute() {
        receivers.turnNextChannel();
    }
}
