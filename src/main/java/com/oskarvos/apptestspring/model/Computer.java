package com.oskarvos.apptestspring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Computer {

    @Autowired
    private MusicPlayer musicPlayer;

    @Override
    public String toString() {
        MusicEnum[] valuesMusicEnums = MusicEnum.values();
        MusicEnum musicEnum = valuesMusicEnums[new Random().nextInt(valuesMusicEnums.length)];

        return "\n===Computer.class=== Start music player " + musicPlayer.playMusic(musicEnum);
    }
}
