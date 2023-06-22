package com.javarush.island.zhidebaev.animals;

import com.javarush.island.zhidebaev.entities.Animal;
import com.javarush.island.zhidebaev.entities.Predators;


public class Fox extends Animal implements Predators {
    private final String icon= "ЛИС";
    public Fox(int weight, int maxNumberOfSpecies, int speed, int satiety){
        super(weight, maxNumberOfSpecies, speed, satiety);
    }

    @Override
    public void eat() {
        System.out.println("я лис - люблю мясо");
    }

    @Override
    public void move() {
        System.out.println("я иду на охоту");
    }

    @Override
    public void die() {
        System.out.println("я бессмертен");
    }


    @Override
    public void reproduse() {
        System.out.println("я размножаюсь");
    }
}
