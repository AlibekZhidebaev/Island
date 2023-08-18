package com.javarush.island.zhidebaev.constants;

import java.util.HashMap;
import java.util.Map;

public final class IslandConstants {
    public static final String ISLAND_NAME = "\n------------ОСТРОВ------------"; // -- Наименование --
    public static final int MAX_WIDTH = 2; // -- Ширина острова --
    public static final int MAX_HEIGHT = 2; // -- Длинна острова --

    public static final String ANIMAL_COUNT_TEXT = "| Общее количество животных | = %d шт \n";
    public static final String PLANTS_COUNT_TEXT = "| Общее количество растении | = %d шт \n" ;

    public static final String ANIMAL_COUNT_IN_LOCATION_TEXT = "Количество животных в локации (%d,%d) => %d шт \n";

    // -- Карта разновидностей животных и их изначальное количество при инициализации Острова --
    public static final Map<String,Integer> countAnimals = new HashMap<String,Integer>() {{
        put("Wolf", 4);         // -- ВОЛК --
   //     put("Snake", 5);        // -- ПИТОН --
     //   put("Fox", 10);          // -- ЛИСА --
//        put("BEAR", 10);         // -- МЕДВЕДЬ --
//        put("EAGLE", 20);        // -- ОРЕЛ --
//        put("HORSE", 100);        // -- ЛОШАДЬ --
//        put("DEER", 50);         // -- ОЛЕНЬ --
//        put("RABBIT", 800);       // -- КРОЛИК --
//        put("MOUSE", 1000);        // -- МЫШЬ --
//        put("GOAT", 100);         // -- КОЗА --
        put("SHEEP", 10);        // -- ОВЦА --
//        put("BOAR", 50);         // -- КАБАН --
//        put("BUFFALO", 60);      // -- БУЙВОЛ --
//        put("DUCK", 70);         // -- УТКА --
//        put("CATERPILLAR", 1000);  // -- ГУСЕНИЦА --
    }};
}
