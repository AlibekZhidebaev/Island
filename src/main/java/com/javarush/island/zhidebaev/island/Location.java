package com.javarush.island.zhidebaev.island;

import com.javarush.island.zhidebaev.entities.Animal;
import com.javarush.island.zhidebaev.entities.Plant;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class Location {
// -- Координаты локации --
        private int x;
        private int y;

    // -- Список животных и растении в локации --
    private final List<Animal> animals = new CopyOnWriteArrayList<>();
    private final List<Plant> plants = new CopyOnWriteArrayList<>();

        // -- Конструкторы --

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }

    public Location() {

    }

    // -- Сеттеры координат --
        public void setX(int x) {
            this.x = x;
        }
        public void setY(int y) {
            this.y = y;
        }

         // -- Геттеры координат --
        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        // -- геттер для списка растении --
        public List<Plant> getPlants() {
            return plants;
         }
        // -- геттер для списка животных --
        public List<Animal> getAnimals() {
            return animals;
    }

        @Override
        public String toString() {
            return " (" + x + "," + y + ")";
        }
}
