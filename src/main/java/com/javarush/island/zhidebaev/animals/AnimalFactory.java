package com.javarush.island.zhidebaev.animals;

import com.javarush.island.zhidebaev.constants.IslandConstants;
import com.javarush.island.zhidebaev.island.Island;
import com.javarush.island.zhidebaev.services.Randomizer;

import java.util.Map;

public final class AnimalFactory {

    public static void addAnimals() {
        for (Map.Entry<String, Integer> entry : IslandConstants.countAnimals.entrySet()) {
            createAnimals(entry.getKey(), entry.getValue());
           // System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }

    public static void createAnimals(String animal, int amount){
        for (int i = 0; i < amount; i++) {
            int x = Randomizer.randomNumber(0, IslandConstants.MAX_WIDTH);
            int y = Randomizer.randomNumber(0, IslandConstants.MAX_HEIGHT);
            Island.getLocation(x,y).getAnimals().add(AnimalList.create(animal));
        }
    }
}
