package com.javarush.island.zhidebaev.entities;


public class Plant extends Entity{
    private final String icon= "\uD83C\uDF31";
    int weight = 1; // -- вес (в кг)--
    int maxNumberOfSpecies = 200; // -- Максимальное количество в одной клетке --

    public Plant(double weight, double maxNumberOfSpecies) {
        super(weight, maxNumberOfSpecies);
        super.setIcon(super.icon = this.icon);
    }

    public Plant() {
        super();
        super.setIcon(super.icon = this.icon);

    }

    public void reproduse() {
        System.out.println("я размножаюсь");
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Plant) super.clone();
    }
}
