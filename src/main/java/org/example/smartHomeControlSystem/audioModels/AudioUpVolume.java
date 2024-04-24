package org.example.smartHomeControlSystem.audioModels;

import org.example.smartHomeControlSystem.comandInterface.Command;
import org.example.smartHomeControlSystem.recievers.AudioSystemReceivers;

public class AudioUpVolume implements Command {
    private AudioSystemReceivers receivers;
    @Override
    public void execute() {

        receivers.addVolume();
    }
}
