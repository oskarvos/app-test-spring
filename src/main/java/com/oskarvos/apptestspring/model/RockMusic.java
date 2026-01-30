package com.oskarvos.apptestspring.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RockMusic implements Music {

    private final String SONG1 = "Кино";
    private final String SONG2 = "Ариа";
    private final String SONG3 = "БИ-2";

    List<String> listSongs = List.of(SONG1, SONG2, SONG3);

    @Override
    public String getSong() {
        return "\n===RockMusic.class=== playing song: " + SONG1;
    }

    @Override
    public List<String> getListSongs() {
        return listSongs;
    }
}