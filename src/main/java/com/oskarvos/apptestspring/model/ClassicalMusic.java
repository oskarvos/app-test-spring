package com.oskarvos.apptestspring.model;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    private final String SONG = "Моцарт";

    @Override
    public String getSong() {
        return "\n===ClassicalMusic.class=== playing song: " + SONG;
    }
}
