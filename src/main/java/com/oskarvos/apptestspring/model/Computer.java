package com.oskarvos.apptestspring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    @Autowired
    private MusicPlayer musicPlayer;

    @Override
    public String toString() {
        return "\n===Computer.class=== Start music player " + musicPlayer.playMusic();
    }
}
