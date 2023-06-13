package com.javarush.island.zhidebaev.services;

import java.util.concurrent.ThreadLocalRandom;

public final class Randomizer {

    public static int getRand(int lowerBounds, int upperBounds) {
        return ThreadLocalRandom.current().nextInt(lowerBounds,upperBounds);
    }
}
