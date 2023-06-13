package com.javarush.island.zhidebaev.entities;

public abstract class Animal extends Entity{

    public int weight; // -- вес (в кг)--
    public int maxNumberOfSpecies; // -- Максимальное количество в одной клетке --
    public int speed; // -- скорость перемещения (не более чем, клеток за ход) --
    public int satiety; // -- насыщение (в кг) --

    protected Animal(int weight, int maxNumberOfSpecies, int speed, int satiety) {
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
