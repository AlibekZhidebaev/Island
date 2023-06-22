package com.javarush.island.zhidebaev.entities;

public abstract class Entity {
    double weight; // -- вес (в кг)--
    double maxNumberOfSpecies; // -- Максимальное количество в одной клетке --



        Entity(double weight, double maxNumberOfSpecies) {
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
