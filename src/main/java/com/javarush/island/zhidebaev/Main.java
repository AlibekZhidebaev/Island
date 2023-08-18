package com.javarush.island.zhidebaev;

import com.javarush.island.zhidebaev.Actions.Start;
import com.javarush.island.zhidebaev.animals.Wolf;
import com.javarush.island.zhidebaev.constants.AnimalCharacteristics;
import com.javarush.island.zhidebaev.constants.IslandConstants;
import com.javarush.island.zhidebaev.entities.Animal;
import com.javarush.island.zhidebaev.island.Island;
import com.javarush.island.zhidebaev.island.Location;
import com.javarush.island.zhidebaev.services.Statistics;


public class Main {

    static String txt = "Кол-во растении в локации => ";
    public static void main(String[] args) {

//        System.out.println( new Wolf(5,5,5,5).getIcon());
//        System.out.println( new Snake(5,5,5,5).getIcon());
//        System.out.println( new Fox(5,5,5,5).getIcon());
//        System.out.println( new Sheep(5,5,5,5).getIcon());
//        System.out.println(Randomizer.getAte(60));

        //----------------------------- Фабрика животных -------------------------------------------------
        //System.out.println(AnimalFactory.createAnimal("Fox",5));
        // System.out.println(new Plants());
        //----------------------------- Инициализация острова -------------------------------------------------
          Island.init();
         Statistics.printIslandStatistics();
        System.out.println(Island.getCell(0,0).getAnimals());
       for(Animal animal : Island.getCell(0,0).getAnimals()){
           if(animal instanceof Wolf) {
             //  animal.eat();
               //animal.move();
               animal.reproduse();


           }

       }
        Island.printFieldTest(Island.getField());

        //Statistics.printIslandStatistics();

//       for (int x = 0; x < IslandConstants.MAX_WIDTH; x++) {
//           for (int y = 0; y < IslandConstants.MAX_HEIGHT; y++) {
//               Location locale = new Location(x, y);
//               for (Animal animal : Island.getLocation(x, y).getAnimals())
//            //   animal.setLocale(locale);
//
//           }
//       }
        //System.out.print(Island.getAllAnimals());
        /////////////////
//        for (int x = 0; x < IslandConstants.MAX_WIDTH; x++)
//            for (int y = 0; y < IslandConstants.MAX_HEIGHT; y++) {
//                for (Animal animal : Island.getCell(x, y).getAnimals())
//                    System.out.print("\n Локация("+x+","+y+")" +animal.getIcon()+animal.getLocale());
//            }


        //--Test section---------------------------------------------------------
//        System.out.println(txt + Island.getLocation(0,1).getPlants().size());
//        System.out.println(txt + Island.getLocation(1,1).getPlants().size());
//        System.out.println(txt + Island.getLocation(2,2).getPlants().size());
//        System.out.println("\n--------------------------------------------\n");
//        Statistics.printIslandStatisticsForEachLocation();
        //-----------------------------------------------------------------------------------------------------
        //AnimalCharacteristics.

//    Animal wolf = new Wolf("\uD83D\uDC3A",0,0,3,0);
//    wolf.setLocale(new Location(5,5));
//        System.out.println(wolf.getLocale());
//        wolf.move();
//        System.out.println(wolf.getLocale());

      //  new Start().start();


    }

}