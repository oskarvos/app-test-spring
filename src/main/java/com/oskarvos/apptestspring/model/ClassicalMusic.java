package com.oskarvos.apptestspring.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClassicalMusic implements Music {

    private final String SONG1 = "Моцарт";
    private final String SONG2 = "Бетховен>";
    private final String SONG3 = "Бах";

    List<String> listSong = List.of(SONG1, SONG2, SONG3);

    @Override
    public String getSong() {
        return "\n===ClassicalMusic.class=== playing song: " + SONG1;
    }

    @Override
    public List<String> getListSongs() {
        return listSong;
    }
}
