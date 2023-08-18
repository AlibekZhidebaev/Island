package com.javarush.island.zhidebaev.animals;

import com.javarush.island.zhidebaev.constants.IslandConstants;
import com.javarush.island.zhidebaev.entities.Animal;
import com.javarush.island.zhidebaev.island.Island;
import com.javarush.island.zhidebaev.island.Cell;
import com.javarush.island.zhidebaev.island.Location;
import com.javarush.island.zhidebaev.services.Randomizer;

import java.util.Map;

    // -- Класс создания животных фабричным методом --
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
    // -- Метод создания разновидностей животных со случайным распределением по ячейкам острова--
    public static void createAnimals(String animalName, int amount) {

        for (int i = 0; i < amount; i++) {
            // -- Получение ячеек острова со случайными координатами --
            Cell cell = Randomizer.getRandomCell();
            // -- Создание разновидностей животных с добавлением локации совпадающий с координатами ячейки --
            Animal animal = AnimalList.create(animalName, new Location(cell.getX(), cell.getY()));
            // -- Добавление в полученную ячейку созданных животных --
            Island.getCell(cell.getX(), cell.getY()).getAnimals().add(animal);
        }
    }
}
