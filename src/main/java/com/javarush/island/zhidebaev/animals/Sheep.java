package com.javarush.island.zhidebaev.animals;

import com.javarush.island.zhidebaev.entities.Animal;
import com.javarush.island.zhidebaev.entities.Predators;


public class Sheep extends Animal implements Predators {
    private final String icon= "\uD83D\uDC11";
    public Sheep(double weight, double maxNumberOfSpecies, double speed, double satiety){
        super(weight, maxNumberOfSpecies, speed, satiety);
        super.setIcon(super.icon = this.icon);
    }


    @Override
    public void eat() {
        System.out.println("я овца - люблю только траву");
    }

    @Override
    public void move() {
        System.out.println("я пасусь");
    }

    @Override
    public void die() {
        System.out.println("меня сожрали");
    }


    @Override
    public void reproduse() {
        System.out.println("я размножаюсь");
    }
}
