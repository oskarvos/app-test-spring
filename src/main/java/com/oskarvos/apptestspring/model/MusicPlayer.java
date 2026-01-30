package com.oskarvos.apptestspring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    @Autowired
    @Qualifier("rockMusic")
    private Music music;

    @Override
    public String toString() {
        return "\n===MusicPlayer.class=== start musicPlayer: " + music.getSong();
    }
}
