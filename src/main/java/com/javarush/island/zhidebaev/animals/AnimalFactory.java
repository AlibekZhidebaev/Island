package com.javarush.island.zhidebaev.animals;

import com.javarush.island.zhidebaev.constants.IslandConstants;
import com.javarush.island.zhidebaev.island.Island;
import com.javarush.island.zhidebaev.services.Randomizer;

import java.util.Map;

    // -- Класс создания животны фабричным методом --
    public final class AnimalFactory {

    // -- Метод добавления животных --
    public static void addAnimals() {
        // -- Получение разновидности животных и их количество с карты --
        for (Map.Entry<String, Integer> entry : IslandConstants.countAnimals.entrySet()) {
            // -- Создание животных с заданным количеством
            createAnimals(entry.getKey(), entry.getValue());
           // System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
    // -- Метод создания животных --
    public static void createAnimals(String animal, int amount){


        for (int i = 0; i < amount; i++) {
            // -- Генерация локации --
            int x = Randomizer.randomNumber(0, IslandConstants.MAX_WIDTH);
            int y = Randomizer.randomNumber(0, IslandConstants.MAX_HEIGHT);
            // -- Создание животных в сгенерированной локации --
            Island.getLocation(x,y).getAnimals().add(AnimalList.create(animal));
        }
    }
}
