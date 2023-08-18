package com.javarush.island.zhidebaev.animals;

import com.javarush.island.zhidebaev.entities.Animal;
import com.javarush.island.zhidebaev.entities.Predators;
import com.javarush.island.zhidebaev.island.Cell;
import com.javarush.island.zhidebaev.island.Location;
import com.javarush.island.zhidebaev.services.Randomizer;


public class Sheep extends Animal {

    public Sheep(String icon, double weight, double maxNumberOfSpecies, double speed, double satiety) {
        super(icon, weight, maxNumberOfSpecies, speed, satiety);
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
