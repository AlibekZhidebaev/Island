package com.javarush.island.zhidebaev.Actions;

public class Zoo {
        private String name;
        private int age;
        private int hunger;

        public Zoo(String name) {
            this.name = name;
            this.age = 0;
            this.hunger = 0;
        }

        public void eat() {
            System.out.println(name + " eat!");
            hunger--;
        }

        public void move() {
            System.out.println(name + " move!");
        }

        public void reproduce() {
            System.out.println(name + " reproduce!");
        }

        public void age() {
            age++;
            hunger++;
        }

        public boolean isHungry() {
            return hunger > 0;
        }

        public boolean canReproduce() {
            // Проверка на возможность размножения
            return age >= 2;
        }

        public boolean isOld() {
            // Проверка на старость
            return age >= 50;
        }
}
