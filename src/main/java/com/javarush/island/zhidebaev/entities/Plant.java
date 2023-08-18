package com.javarush.island.zhidebaev.entities;


public class Plant extends Entity {

    public Plant (String icon, double weight, double maxNumberOfSpecies) {
        super(icon, weight, maxNumberOfSpecies);
    }

    public void reproduse() {
        System.out.println("я размножаюсь");
    }


}
