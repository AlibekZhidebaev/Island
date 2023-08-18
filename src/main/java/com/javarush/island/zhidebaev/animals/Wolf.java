package com.javarush.island.zhidebaev.animals;

import com.javarush.island.zhidebaev.constants.FeedingMap;
import com.javarush.island.zhidebaev.entities.Animal;
import com.javarush.island.zhidebaev.entities.Predators;
import com.javarush.island.zhidebaev.island.Cell;
import com.javarush.island.zhidebaev.island.Location;
import com.javarush.island.zhidebaev.services.Randomizer;

import java.util.Map;
import java.util.Objects;


public class Wolf extends Animal {
    Map <String,Integer> feedingMap = FeedingMap.wolfFeedingMap;


    public Wolf(String icon, double weight, double maxNumberOfSpecies, double speed, double satiety) {
        super(icon, weight, maxNumberOfSpecies, speed, satiety);
    }



//    @Override
//    public void move() {
//
//        System.out.println("я иду на охоту");
//    }

    @Override
    public void die() {
        System.out.println("я бессмертен");
    }

//    @Override
//    public void reproduse() {
//        System.out.println("я размножаюсь");
//    }

}
