package com.javarush.island.zhidebaev.island;

import com.javarush.island.zhidebaev.constants.Constants;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Island {

    private static List<Location> field = new ArrayList<>();
    static int MAX_WIDTH = 20;
    static int MAX_HEIGHT = 10;

    // --
    public static List<Location> makeField() {
        System.out.println(Constants.ISLAND_NAME);
        for (int i = 0; i < MAX_WIDTH; i++) {
            for (int j = 0; j < MAX_HEIGHT; j++) {
                field.add(new Location(i,j));
            }
        }
        return field;
    }
    public static void printField(List<Location> field) {
        for (int i = 0; i < field.size(); i++){
        if(i % MAX_WIDTH != 0) System.out.print(field.get(i));
        else System.out.print("\n"+field.get(i));
        }
        System.out.println("\n------------------------------\n");
    }

    public static Location getLocation (int x,int y){

        return field.stream()
                .filter(s ->(s.getX() == x))
                .filter(s ->(s.getY() == y))
                .toList()
                .get(0);

    }

}
