package com.javarush.island.zhidebaev.entities;

public abstract class Animal extends Entity{

    // -- метод кушать --
    public abstract void eat();

    // -- метод передвигаться --
    public abstract void move();

    // -- метод вымирать --
    public abstract void die();
}
