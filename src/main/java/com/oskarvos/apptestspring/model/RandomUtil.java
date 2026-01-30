package com.oskarvos.apptestspring.model;

import java.util.List;
import java.util.Random;

public class RandomUtil {

    public <T> T getElementRandom(List<T> element) {
        Random random = new Random();
        return element.get(random.nextInt(element.size()));
    }

}
