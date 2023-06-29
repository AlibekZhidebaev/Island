package com.javarush.island.zhidebaev.entities;

public abstract class Entity {



    protected String icon;
    double weight; // -- вес (в кг)--
    double maxNumberOfSpecies; // -- Максимальное количество в одной клетке --

    Entity(){}
    Entity(double weight, double maxNumberOfSpecies) {
        this.weight = weight;
        this.maxNumberOfSpecies = maxNumberOfSpecies;
    }

    public void setIcon (String icon) {  this.icon = icon;    }
    public String getIcon() { return icon;  }

    // -- метод размножаться --
    public abstract void reproduse();


    @Override
    public String toString() {
        return   "\n" + this.getClass().getSimpleName() +" ["+this.getIcon()+ "]" + " => " +
                "| Вес = " + weight + " кг " +
                "| Максимальное количество в ячейке = " + maxNumberOfSpecies + " особей |";
    }
}
