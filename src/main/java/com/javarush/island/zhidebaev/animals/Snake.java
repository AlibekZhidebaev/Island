package com.javarush.island.zhidebaev.animals;

import com.javarush.island.zhidebaev.entities.Animal;
import com.javarush.island.zhidebaev.entities.Predators;


public class Snake extends Animal implements Predators {
    private final String icon= "\uD83D\uDC0D";
    public Snake(double weight, double maxNumberOfSpecies, double speed, double satiety){
        super(weight, maxNumberOfSpecies, speed, satiety);
    }

    public String getIcon() {   return icon;   }
    @Override
    public void eat() {
        System.out.println("я Питон - люблю мясо");
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
