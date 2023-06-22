package com.javarush.island.zhidebaev.animals;

import com.javarush.island.zhidebaev.entities.Animal;

import java.util.ArrayList;
import java.util.List;

public final class AnimalFactory {
    public static List<Animal> createAnimal(String animal, int amount){
        List <Animal> animals = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            animals.add(AnimalList.create(animal));
        }
        return animals;
    }
}
