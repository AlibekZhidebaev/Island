package com.javarush.island.zhidebaev.animals;

import com.javarush.island.zhidebaev.constants.AnimalCharacteristics;
import com.javarush.island.zhidebaev.entities.Animal;
import com.javarush.island.zhidebaev.island.Location;

public final class AnimalList {

    public static  Animal create(String animal, Location locale) {
        // -- Преобразование данных и получение соответствующей команды с помощью метода getFunction() --
        Animal animalType = null;
        switch (animal){
        case "Wolf": animalType =new Wolf(AnimalCharacteristics.wolfIcon,0,0,0,0);
                     animalType.setLocale(locale);
        break;
        case "SHEEP": animalType =new Sheep(AnimalCharacteristics.sheepIcon,0,0,0,0);
                    animalType.setLocale(locale);
                    break;
      //  case "Snake": animalType =new Snake(0,0,0,0,locale); break;

        }

        return animalType;

    }
    /*
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

    AnimalList2(Animal animal) {
        this.animal = animal;
    }

    private Animal getAnimal() {
        return animal;
    }

    // -- метод find() (найти) для поиска команды в текущем списке --
    public static Animal create(String animal,Location locale) {
        // -- Преобразование данных и получение соответствующей команды с помощью метода getFunction() --
       return AnimalList2.valueOf(animal.toUpperCase()).getAnimal();
    }

    public static String getIconAnimal(String animal) {
        // -- ПрAnimalListеобразование данных и получение соответствующей команды с помощью метода getFunction() --
        return AnimalList2.valueOf(animal.toUpperCase()).getAnimal().getIcon();
    }
*/
}
