package org.example.smartHomeControlSystem.tvModels;

import org.example.smartHomeControlSystem.comandInterface.Command;
import org.example.smartHomeControlSystem.recievers.TVReceivers;

public class TVUpVolume implements Command {
    private TVReceivers receivers;

    public TVUpVolume(TVReceivers receivers) {
        this.receivers = receivers;
    }

    @Override
    public void execute() {
        receivers.addVolume();
    }
}
