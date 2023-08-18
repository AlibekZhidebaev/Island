package com.javarush.island.zhidebaev.constants;

import java.util.HashMap;
import java.util.Map;

    // -- Количество живностей - 15 --
public final class FeedingMap {

        // -- КАРТА ПИТАНИЯ ХИЩНИКОВ. Количество - 5 (Волк, Удав, Лиса, Медведь, Орел) --

    // -- Карта питания волка --
    public static final Map <String,Integer> wolfFeedingMap = new HashMap<String,Integer>() {{
        put("Horse", 10);
        put("Deer", 15);
        put("Rabbit", 60);
        put("Mouse", 80);
        put("Goat", 60);
        put("Sheep", 70);
        put("Boar", 15);
        put("Buffalo", 10);
        put("Duck", 40);
    }};
        public static final Map <String,Integer> feedingMap = new HashMap<String,Integer>() {{  put("Plants", 100);  }};


    // -- КАРТА ПИТАНИЯ ВСЕЯДНЫХ. Количество - 3 (Мышь, Кабан, Утка) --

    public static final Map <String,Integer> mouseFeedingMap = new HashMap<String,Integer>() {{  put("Plants", 100);  }};
    public static final Map <String,Integer> boareedingMap = new HashMap<String,Integer>() {{  put("Plants", 100);  }};
    public static final Map <String,Integer> duckFeedingMap = new HashMap<String,Integer>() {{  put("Plants", 100);  }};


    // -- КАРТА ПИТАНИЯ ТОЛЬКО ТРАВОЯДНЫХ. Количество - 7 (Лошадь, Олень, Кролик, Коза, Овца, Буйвол, Гусеница) --
    public static final Map <String,Integer> herbivoreFeedingMap = new HashMap<String,Integer>() {{  put("Plants", 100);  }};
}
