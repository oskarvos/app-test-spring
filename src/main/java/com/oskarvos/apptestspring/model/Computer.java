package com.oskarvos.apptestspring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    @Autowired
    private MusicPlayer musicPlayer;

    public void start() {
        System.out.println("\n===Computer.class=== Запускаем плеер...");

        System.out.println("\n1. Вызываем playRandomListArtists():");
        String result1 = musicPlayer.playRandomListArtists();
        System.out.println("Результат 1 получен: " + result1);

        System.out.println("\n2. Вызываем playRandomMusician():");
        String result2 = musicPlayer.playRandomMusician();
        System.out.println("Результат 2 получен: " + result2);
    }

}
