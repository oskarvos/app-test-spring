package com.oskarvos.apptestspring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private final Music music1;
    private final Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(MusicEnum musicEnum) {
        String str = "\n===MusicPlayer.class=== start musicPlayer list songs: ";

        return musicEnum.equals(MusicEnum.CLASSICAL) ?
                str + music1.getListSongs() :
                str + music2.getListSongs();
    }

}
