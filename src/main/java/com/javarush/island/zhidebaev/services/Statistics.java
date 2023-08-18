package com.javarush.island.zhidebaev.services;

import com.javarush.island.zhidebaev.constants.IslandConstants;
import com.javarush.island.zhidebaev.entities.Animal;
import com.javarush.island.zhidebaev.entities.Plant;
import com.javarush.island.zhidebaev.island.Island;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public final class Statistics  {

   static List<Animal> allAnimals = new ArrayList<>();
   static List<Plant> allPlants = new ArrayList<>();

   static {   allEntities();  } // -- инициализация списка --

   // -- Метод получения списка животных во всех локациях острова --
   private static void allEntities() {
      for (int i = 0; i < IslandConstants.MAX_WIDTH; i++) {
         for (int j = 0; j < IslandConstants.MAX_HEIGHT; j++) {
            allAnimals.addAll(Island.getCell(i, j).getAnimals());
            allPlants.addAll(Island.getCell(i, j).getPlants());
         }
      }
   }

   // -- Метод подсчета суммы всех животных во всех локациях острова --
   private static void getCountAllAnimal () {
      System.out.printf(IslandConstants.ANIMAL_COUNT_TEXT, allAnimals.size());
   }

   // -- Метод подсчета количества животных каждого вида во всех локациях острова --
   private static  List<Animal> getAnimals (String animal) {
      return allAnimals.stream()
              .filter( animals -> (animals.getClass().getSimpleName().equals(animal)))
              .collect(Collectors.toList());
   }

   // -- Вывод списка животных и их количество во всех локациях острова --
   private static void printListForEachAnimal() {
      for (Map.Entry<String, Integer> entry : IslandConstants.countAnimals.entrySet()) {
      //   System.out.println(AnimalList.getIconAnimal(entry.getKey()) + " = " + getAnimals(entry.getKey()).size() + " особей");
      }
   }

   // -- Вывод количество растений во всех локациях острова --
   private static void printListForEachPlants() {
         System.out.printf(IslandConstants.PLANTS_COUNT_TEXT, allPlants.size());
      }

   // -- Вывод общей статистики --
   public static void printIslandStatistics() {
         printListForEachPlants();
         getCountAllAnimal();
         printListForEachAnimal();
   }

   public static void printIslandStatisticsForLocation(int x,int y) {
      int countAnimals = Island.getCell(x, y).getAnimals().size();
      System.out.printf(IslandConstants.ANIMAL_COUNT_IN_LOCATION_TEXT ,x,y,countAnimals);
   }

   public static void printIslandStatisticsForEachLocation() {
      for (int i = 0; i < IslandConstants.MAX_WIDTH; i++) {
         for (int j = 0; j < IslandConstants.MAX_HEIGHT; j++) {
            printIslandStatisticsForLocation(i,j);
         }
      }
   }
}
