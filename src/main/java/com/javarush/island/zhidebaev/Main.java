package com.javarush.island.zhidebaev;

import com.javarush.island.zhidebaev.animals.*;
import com.javarush.island.zhidebaev.island.Island;
import com.javarush.island.zhidebaev.services.Randomizer;


public class Main {
    public static void main(String[] args) {

        System.out.println( new Wolf(5,5,5,5).getIcon());
        System.out.println( new Snake(5,5,5,5).getIcon());
        System.out.println( new Fox(5,5,5,5).getIcon());
        System.out.println( new Sheep(5,5,5,5).getIcon());
        System.out.println(Randomizer.getAte(60));

    //----------------------------- Фабрика животных -------------------------------------------------
        //System.out.println(AnimalFactory.createAnimal("Fox",5));
       // System.out.println(new Plants());
    //----------------------------- Инициализация острова -------------------------------------------------
         //Island.init();

        //--Test section---------------------------------------------------------
//        System.out.println(Island.getLocation(0,1).getPlants().size());
//        System.out.println(Island.getLocation(1,1).getPlants().size());
//        System.out.println(Island.getLocation(2,2).getPlants().size());
//        System.out.println("\n--------------------------------------------\n");
//        System.out.println(Island.getLocation(0,0).getAnimals().size());
//        System.out.println(Island.getLocation(0,1).getAnimals().size());
//        System.out.println(Island.getLocation(0,2).getAnimals().size());
//        System.out.println(Island.getLocation(1,0).getAnimals().size());
//        System.out.println(Island.getLocation(1,1).getAnimals().size());
//        System.out.println(Island.getLocation(1,2).getAnimals().size());
//        System.out.println(Island.getLocation(2,0).getAnimals().size());
//        System.out.println(Island.getLocation(2,1).getAnimals().size());
//        System.out.println(Island.getLocation(2,2).getAnimals().size());

    //-----------------------------------------------------------------------------------------------------
        //AnimalCharacteristics.

       // System.out.println("\uD83D\uDC3A");
//        int i =  Randomizer.getRand(1,11);
//        int j = Randomizer.getRand(0,2);
//        System.out.println(i);System.out.println(j);
//        System.out.println("Большее число из 2 чисел: " + Math.max(1,2));
       // Animal wolf = new Wolf(50,30,3,8);
       // System.out.println(wolf);
      //  System.out.println((int)(Math.random()*10));
//        System.out.println(wolf.satiety);
//        System.out.println(wolf.speed);
//        System.out.println(wolf.weight);
//        System.out.println(wolf.maxNumberOfSpecies);
//
//
//        System.out.println();
//        wolf.eat();
//        wolf.move();
//        wolf.reproduse();
//        wolf.die();

        //System.out.println(wolf.characteristics().toString());
      //  System.out.println(wolf.characteristics().isEmpty());
    }

}