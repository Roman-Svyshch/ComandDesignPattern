package org.example.smartHomeControlSystem;


import org.example.smartHomeControlSystem.invoker.RemoteControllerSmartHome;
import org.example.smartHomeControlSystem.recievers.AudioSystemReceivers;
import org.example.smartHomeControlSystem.recievers.LampReceivers;
import org.example.smartHomeControlSystem.recievers.TVReceivers;
import org.example.smartHomeControlSystem.tvModels.TVTurnDownVolume;
import org.example.smartHomeControlSystem.tvModels.TVUpVolume;
import org.example.smartHomeControlSystem.tvModels.TurnNextChannel;
import org.example.smartHomeControlSystem.tvModels.TurnPreviousChannel;

public class Main {
    public static void main(String[] args) {
        TVReceivers tvReceivers = new TVReceivers("TV Samsung");
        AudioSystemReceivers audioSystemReceivers =
                new AudioSystemReceivers("harman cardon audio system");
        LampReceivers lampReceivers = new LampReceivers("Neon Lamp");

        TVTurnDownVolume tvTurnDownVolume = new TVTurnDownVolume(tvReceivers);
        TVUpVolume tvUpVolume = new TVUpVolume(tvReceivers);
        TurnNextChannel turnNextChannel = new TurnNextChannel(tvReceivers);
        TurnPreviousChannel turnPreviousChannel = new TurnPreviousChannel(tvReceivers);

        RemoteControllerSmartHome remoteControlTV = new RemoteControllerSmartHome
                                (tvUpVolume,
                                tvTurnDownVolume,
                                turnNextChannel,
                                turnPreviousChannel);

        remoteControlTV.addVolumeButton();
        remoteControlTV.arrowNextChannelButton();
        remoteControlTV.arrowPrevChannelButton();
        remoteControlTV.turnDownVolumeButton();
    }
}
