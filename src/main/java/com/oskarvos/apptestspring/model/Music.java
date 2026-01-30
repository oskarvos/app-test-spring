package com.oskarvos.apptestspring.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface Music {

    List<String> getListArtists();

}
