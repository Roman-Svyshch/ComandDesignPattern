package org.example.smartHomeControlSystem.tvModels;

import org.example.smartHomeControlSystem.comandInterface.Command;
import org.example.smartHomeControlSystem.recievers.TVReceivers;

public class TurnPreviousChannel implements Command {
    private TVReceivers receivers;

    public TurnPreviousChannel(TVReceivers receivers) {
        this.receivers = receivers;
    }

    @Override
    public void execute() {
        receivers.turnNextChannel();
    }
}
