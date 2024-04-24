package org.example.smartHomeControlSystem.audioModels;

import org.example.smartHomeControlSystem.comandInterface.Command;
import org.example.smartHomeControlSystem.recievers.AudioSystemReceivers;

public class AudioTurnDownVolume implements Command {

    private AudioSystemReceivers receivers;

    public AudioTurnDownVolume(AudioSystemReceivers receivers) {
        this.receivers = receivers;
    }

    @Override
    public void execute() {
        receivers.turnDownVolume();
    }
}
