package com.javarush.island.zhidebaev.island;

public final class Location {

        // -- Координаты локации --
        private int x;
        private int y;

        // -- Конструкторы --
        public Location(int x, int y) {
            this.x = x;
            this.y = y;
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

        @Override
        public String toString() {
            return " (" + x + "," + y + ")";
        }
}
