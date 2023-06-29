package com.javarush.island.zhidebaev.entities;

public abstract class Animal extends Entity{

    public double weight; // -- вес (в кг)--
    public double maxNumberOfSpecies; // -- Максимальное количество в одной клетке --
    public double speed; // -- скорость перемещения (не более чем, клеток за ход) --
    public double satiety; // -- насыщение (в кг) --

    protected Animal(double weight, double maxNumberOfSpecies, double speed, double satiety) {
        super(weight, maxNumberOfSpecies);
        this.weight = super.weight;
        this.maxNumberOfSpecies = super.maxNumberOfSpecies;
        this.speed = speed;
        this.satiety = satiety;
    }

    // -- метод кушать --
    public abstract void eat();

    // -- метод передвигаться --
    public abstract void move();

    // -- метод вымирать --
    public abstract void die();


    @Override
    public String toString() {
        return   super.toString() +
                " Скорость передвижения = " + speed + " ячейки за такт " +
                "| Пища для насыщения = " + satiety + " кг |";
    }
}
