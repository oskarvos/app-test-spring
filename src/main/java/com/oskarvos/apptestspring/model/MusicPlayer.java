package com.oskarvos.apptestspring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Stream;

@Component
public class MusicPlayer {

    private final String START_MUSIC_ARTIST =
            "\n===MusicPlayer.class=== Музыкальный плеер играет следующего(их) артиста(ов) :";

    public String playRandomListArtists() {
        List<MusicEnum> valuesMusicEnums = List.of(MusicEnum.values());
        MusicEnum musicEnum = new RandomUtil().getElementRandom(valuesMusicEnums);

        return START_MUSIC_ARTIST + (musicEnum.equals(MusicEnum.CLASSICAL) ?
                new ClassicalMusic().getListArtists() :
                new RockMusic().getListArtists());
    }

    public String playRandomMusician() {
        List<String> result = Stream.concat(
                        new ClassicalMusic().getListArtists().stream(),
                        new RockMusic().getListArtists().stream())
                .toList();

        return START_MUSIC_ARTIST + new RandomUtil().getElementRandom(result);
    }

}
