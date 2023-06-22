package com.javarush.island.zhidebaev.island;

import com.javarush.island.zhidebaev.animals.AnimalFactory;
import com.javarush.island.zhidebaev.constants.IslandConstants;
import com.javarush.island.zhidebaev.entities.Plant;
import com.javarush.island.zhidebaev.services.Randomizer;
import java.util.ArrayList;
import java.util.List;

    // -- Создание острова --

public final class Island {

    private static final List<Location> field = new ArrayList<>(); // -- Поле ввиде списка локации --

    // -- Метод инициализации острова --
    public static void init(){
        List<Location> field = makeField();
        printField(field);
        addPlants();
        AnimalFactory.addAnimals();
    }

    // -- Метод создания списка локации --
    public static List<Location> makeField() {
        System.out.println(IslandConstants.ISLAND_NAME);
        for (int i = 0; i < IslandConstants.MAX_WIDTH; i++) {
            for (int j = 0; j < IslandConstants.MAX_HEIGHT; j++) {
                field.add(new Location(i,j));
            }
        }
        return field;
    }

    // -- Метод просмотра локации поля острова --
    public static void printField(List<Location> field) {
        for (int i = 0; i < field.size(); i++){
        if(i % IslandConstants.MAX_WIDTH != 0) System.out.print(field.get(i));
        else System.out.print("\n"+field.get(i));
        }
        System.out.println("\n------------------------------\n");
    }

    // -- Метод получения локации по координатам (x,y) --
    public static Location getLocation (int x,int y){
        return field.stream()
                .filter(s ->(s.getX() == x))
                .filter(s ->(s.getY() == y))
                .toList()
                .get(0);
    }

    // -- метод добавления растительностей в каждую локацию --
    public static void  addPlants(){
        for(Location location : field)
        for(int i = 0; i < Randomizer.randomNumber(120,180); i++) {
            location.getPlants().add(new Plant());
        }
    }
}
