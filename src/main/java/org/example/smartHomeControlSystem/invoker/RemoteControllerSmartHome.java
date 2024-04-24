package org.example.smartHomeControlSystem.invoker;

import org.example.smartHomeControlSystem.comandInterface.Command;
import org.example.smartHomeControlSystem.tvModels.TVTurnDownVolume;
import org.example.smartHomeControlSystem.tvModels.TVUpVolume;
import org.example.smartHomeControlSystem.tvModels.TurnNextChannel;
import org.example.smartHomeControlSystem.tvModels.TurnPreviousChannel;

public class RemoteControllerSmartHome {
    private Command switchON;
    private Command switchOFF;
    private Command nextChannel;
    private Command previousChannel;
    private Command addVolume;
    private Command turnDownVolume;
    private Command pause;

    public RemoteControllerSmartHome(Command nextChannel, Command previousChannel, Command addVolume, Command turnDownVolume) {
        this.nextChannel = nextChannel;
        this.previousChannel = previousChannel;
        this.addVolume = addVolume;
        this.turnDownVolume = turnDownVolume;
    }

    public RemoteControllerSmartHome(Command switchON, Command switchOFF) {
        this.switchON = switchON;
        this.switchOFF = switchOFF;
    }


    public void onButton(){
        switchON.execute();
    }
    public void offButton(){
        switchOFF.execute();
    }
    public void arrowNextChannelButton(){
        nextChannel.execute();
    }
    public void arrowPrevChannelButton(){
        previousChannel.execute();
    }
    public void addVolumeButton(){
        addVolume.execute();
    }
    public void turnDownVolumeButton(){
        turnDownVolume.execute();
    }
    public void pauseButton(){
        pause.execute();
    }

}
