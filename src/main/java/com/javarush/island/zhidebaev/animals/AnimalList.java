package com.javarush.island.zhidebaev.animals;

import com.javarush.island.zhidebaev.entities.Animal;
import com.javarush.island.zhidebaev.constants.AnimalCharacteristics;

public enum AnimalList {
    WOLF(new Wolf(AnimalCharacteristics.wolfCharacter.get(0),
                  AnimalCharacteristics.wolfCharacter.get(1),
                  AnimalCharacteristics.wolfCharacter.get(2),
                  AnimalCharacteristics.wolfCharacter.get(3))),
    SNAKE(new Snake(AnimalCharacteristics.snakeCharacter.get(0),
                    AnimalCharacteristics.snakeCharacter.get(1),
                    AnimalCharacteristics.snakeCharacter.get(2),
                    AnimalCharacteristics.snakeCharacter.get(3))),
    FOX(new Fox(AnimalCharacteristics.foxCharacter.get(0),
                AnimalCharacteristics.foxCharacter.get(1),
                AnimalCharacteristics.foxCharacter.get(2),
                AnimalCharacteristics.foxCharacter.get(3)));

    private final Animal animal;

    AnimalList(Animal animal) {
        this.animal = animal;
    }

    private Animal getAnimal() {
        return animal;
    }

    // -- метод find() (найти) для поиска команды в текущем списке --
    public static Animal create(String animal) {
        // -- Преобразование данных и получение соответствующей команды с помощью метода getFunction() --
        return AnimalList.valueOf(animal.toUpperCase()).getAnimal();

    }
}
