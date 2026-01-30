package com.oskarvos.apptestspring.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClassicalMusic implements Music {

    private final String ARTIST1 = "Моцарт";
    private final String ARTIST2 = "Бетховен>";
    private final String ARTIST3 = "Бах";

    List<String> listSong = List.of(
            ARTIST1, ARTIST2, ARTIST3);

    @Override
    public List<String> getListArtists() {
        return listSong;
    }

}
