package com.javarush.island.zhidebaev.entities;

import com.javarush.island.zhidebaev.island.Island;
import com.javarush.island.zhidebaev.island.Location;

public abstract class Entity {
    private String icon; // -- иконка --
    private double weight; // -- вес (в кг)--
    private double maxNumberOfSpecies; // -- Максимальное количество в одной клетке --

    Entity(String icon, double weight, double maxNumberOfSpecies) {
        this.icon = icon;
        this.weight = weight;
        this.maxNumberOfSpecies = maxNumberOfSpecies;
    }

    public String getIcon() {
        return icon;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getMaxNumberOfSpecies() {
        return maxNumberOfSpecies;
    }

    // -- метод размножаться --
    public abstract void reproduse();

    @Override
    public String toString() {
        return "\n" + this.getClass().getSimpleName() + " [" + this.getIcon() + "]" + " => " +
                "| Вес = " + weight + " кг " +
                "| Максимальное количество в ячейке = " + maxNumberOfSpecies + " особей |";
    }
    @Override
    public Entity clone() {
        try {
            Entity clonedEntity = (Entity) super.clone();
            return clonedEntity;

        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
