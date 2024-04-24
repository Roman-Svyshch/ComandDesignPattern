package org.example.smartHomeControlSystem.tvModels;

import org.example.smartHomeControlSystem.comandInterface.Command;
import org.example.smartHomeControlSystem.recievers.TVReceivers;

public class TVTurnDownVolume implements Command {
    private TVReceivers receivers;

    public TVTurnDownVolume(TVReceivers receivers) {
        this.receivers = receivers;
    }

    @Override
    public void execute() {
        receivers.turnDownVolume();
    }
}
