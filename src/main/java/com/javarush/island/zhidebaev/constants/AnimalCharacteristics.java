package com.javarush.island.zhidebaev.constants;

import java.util.ArrayList;
import java.util.List;

public final class AnimalCharacteristics {


    // -- Характеристики животных по индексам массива --
    // -- (0 - вес, 1 - max кол. в одной клетке, 2 - скорость перемещения, 3 - насыщение в кг) --
    public static final List<Double> wolfCharacter = new ArrayList<>(List.of(50.0, 30.0, 3.0, 8.0));
    public static final List<Double> snakeCharacter = new ArrayList<>(List.of(15.0, 30.0, 1.0, 3.0));
    public static final List<Double> foxCharacter = new ArrayList<>(List.of(8.0, 30.0, 2.0, 2.0));
    public static final List<Double> bearCharacter = new ArrayList<>(List.of(500.0, 5.0, 2.0, 80.0));
    public static final List<Double> eagleCharacter = new ArrayList<>(List.of(6.0, 20.0, 3.0, 1.0));


    public static final List<Double> horseCharacter = new ArrayList<>(List.of(400.0, 20.0, 4.0, 60.0));
    public static final List<Double> deerCharacter = new ArrayList<>(List.of(300.0, 20.0, 4.0, 50.0));
    public static final List<Double> rabbitCharacter = new ArrayList<>(List.of(2.0, 150.0, 2.0, 0.45));
    public static final List<Double> mouseCharacter = new ArrayList<>(List.of(0.05, 500.0, 1.0, 0.01));
    public static final List<Double> goatCharacter = new ArrayList<>(List.of(60.0, 140.0, 3.0, 10.0));
    public static final List<Double> sheepCharacter = new ArrayList<>(List.of(70.0, 140.0, 3.0, 15.0));
    public static final List<Double> boarCharacter = new ArrayList<>(List.of(400.0, 50.0, 2.0, 50.0));
    public static final List<Double> buffaloCharacter = new ArrayList<>(List.of(700.0, 10.0, 3.0, 300.0));
    public static final List<Double> duckCharacter = new ArrayList<>(List.of(1.0, 200.0, 4.0, 0.15));
    public static final List<Double> caterpillarCharacter = new ArrayList<>(List.of(0.01, 1000.0, 0.0, 0.0));

    public static final List<Double> plantsCharacter = new ArrayList<>(List.of(1.0, 200.0));
}
