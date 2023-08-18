package com.javarush.island.zhidebaev.services;

import com.javarush.island.zhidebaev.constants.IslandConstants;
import com.javarush.island.zhidebaev.island.Cell;
import com.javarush.island.zhidebaev.island.Location;

import java.util.concurrent.ThreadLocalRandom;

public final class Randomizer {


    private static String move; // переменная движения


    // -- --
    public static int randomNumber(int lowerBounds, int upperBounds) {
        return ThreadLocalRandom.current().nextInt(lowerBounds,upperBounds);
    }

    public static int randomNumber(int upperBounds) {
        int lowerBounds = 0;
        return randomNumber(lowerBounds, upperBounds);
    }

    public static int randomNumber() {
        int lowerBounds = 0;
        int upperBounds = 100;
        return randomNumber(lowerBounds, upperBounds);
    }

    public static int randomListIndex (int upperBounds) {
        return randomNumber(upperBounds);
    }
    // -- метод для определения половой принадлежности животных с вероятностью 50 на 50 --
    public static String getSex () {
        return randomNumber(0,100) < 50 ? "male":"female" ;
    }
    // -- метод для определения съедания жертвы хищником с заданной вероятностью --
    public static boolean victimEaten (int chance) {
        return randomNumber(0,100) < chance ? true : false;
    }

    // -- метод для возвращения значения переменной движения в зависимости от случайных чисел от 1 до 4 --
    public static String getMove() {

        switch(randomNumber(1,5)) {
            case 1: move ="up"; break;
            case 2: move ="down"; break;
            case 3: move ="right"; break;
            case 4: move ="left"; break;
        }
        return move;
    }
    public static int getRandomSpeed(double maxSpeed){
        int i = randomNumber(1, (int) (maxSpeed+1));
        return i;
    }
    public static Cell getRandomCell(){
        int x = randomNumber(0, IslandConstants.MAX_WIDTH);
        int y = randomNumber(0, IslandConstants.MAX_HEIGHT);
        return new Cell(x,y);
    }

    public static Location getRandomLocale(){
        int x = randomNumber(0, IslandConstants.MAX_WIDTH);
        int y = randomNumber(0, IslandConstants.MAX_HEIGHT);
        return new Location(x,y);
    }

}
