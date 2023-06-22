package com.javarush.island.zhidebaev.services;

import java.util.concurrent.ThreadLocalRandom;

public final class Randomizer {

    private static String move; // переменная движения


    // -- --
    public static int randomNumber(int lowerBounds, int upperBounds) {
        return ThreadLocalRandom.current().nextInt(lowerBounds,upperBounds);
    }
    // -- метод для определения половой принадлежности животных с вероятностью 50 на 50 --
    public static String getSex () {
        return ThreadLocalRandom.current().nextInt(0,100) < 50 ? "male":"female" ;
    }

    // -- метод для возвращения значения переменной движения в зависимости от случайных чисел от 1 до 4 --
    public static String getMove() {

        switch(ThreadLocalRandom.current().nextInt(1,5)) {
            case 1: move ="up"; break;
            case 2: move ="down"; break;
            case 3: move ="right"; break;
            case 4: move ="left"; break;
        }
        return move;
    }
}
