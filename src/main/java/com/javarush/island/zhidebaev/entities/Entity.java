package com.javarush.island.zhidebaev.entities;

public abstract class Entity {
    int weight; // -- вес (в кг)--
    int maxNumberOfSpecies; // -- Максимальное количество в одной клетке --

        Entity(int weight, int maxNumberOfSpecies) {
        this.weight = weight;
        this.maxNumberOfSpecies = maxNumberOfSpecies;
    }

    // -- метод размножаться --
    public abstract void reproduse();

    @Override
    public String toString() {
        return   "\n" + this.getClass().getSimpleName() + " => " +
                "| Вес = " + weight + " кг " +
                "| Максимальное количество в ячейке = " + maxNumberOfSpecies + " особей |";
    }
}
