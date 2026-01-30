package com.oskarvos.apptestspring.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RockMusic implements Music {

    private final String ARTIST1 = "Кино";
    private final String ARTIST2 = "Ариа";
    private final String ARTIST3 = "БИ-2";

    List<String> listSongs = List.of(
            ARTIST1, ARTIST2, ARTIST3);

    @Override
    public List<String> getListArtists() {
        return listSongs;
    }

}
