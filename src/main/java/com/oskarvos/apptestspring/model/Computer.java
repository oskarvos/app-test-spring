package com.oskarvos.apptestspring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    @Autowired
    private MusicPlayer musicPlayer;

    public String start() {
        return String.format("%n===Computer.class=== Компьютер запустил музыкальный плеер!!! %s%s",
                musicPlayer.playRandomListArtists(),
                musicPlayer.playRandomMusician());
    }

}
