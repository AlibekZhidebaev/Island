package com.javarush.island.zhidebaev.services;

import com.javarush.island.zhidebaev.animals.AnimalList;
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

   static {   allEntities();  }

   // -- Метод получения списка животных во всех локациях острова --
   private static void allEntities() {
      for (int i = 0; i < IslandConstants.MAX_WIDTH; i++) {
         for (int j = 0; j < IslandConstants.MAX_HEIGHT; j++) {
            allAnimals.addAll(Island.getLocation(i, j).getAnimals());
            allPlants.addAll(Island.getLocation(i, j).getPlants());
         }
      }
   }

   // -- Метод подсчета суммы всех животных во всех локациях острова --
   public static void getCountAllAnimal () {
      System.out.println(IslandConstants.ANIMAL_COUNT_TEXT+ allAnimals.size());
   }

   // -- Метод подсчета количества животных каждого вида во всех локациях острова --
   private static  List<Animal> getAnimals (String animal) {
      return allAnimals.stream()
              .filter( animals -> (animals.getClass().getSimpleName().equals(animal)))
              .collect(Collectors.toList());
   }

   // -- Вывод списка животных и их количество во всех локациях острова --
   public static void printListForEachAnimal() {
      for (Map.Entry<String, Integer> entry : IslandConstants.countAnimals.entrySet()) {
         System.out.println(AnimalList.getIconAnimal(entry.getKey()) + " = " + getAnimals(entry.getKey()).size() + " особей");
      }
   }

   // -- Вывод количество растений во всех локациях острова --
      public static void printListForEachPlants() {
         System.out.println(IslandConstants.PLANTS_COUNT_TEXT + allPlants.size());
      }
}
