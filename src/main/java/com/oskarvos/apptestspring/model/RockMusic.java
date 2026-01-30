package com.oskarvos.apptestspring.model;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

    private final String SONG = "Кино";

    @Override
    public String getSong() {
        return "\n===RockMusic.class=== playing song: " + SONG;
    }
}