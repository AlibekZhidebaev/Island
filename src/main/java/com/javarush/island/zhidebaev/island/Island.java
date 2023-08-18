package com.javarush.island.zhidebaev.island;

import com.javarush.island.zhidebaev.animals.AnimalFactory;
import com.javarush.island.zhidebaev.constants.IslandConstants;
import com.javarush.island.zhidebaev.constants.PlantsCharacteristics;
import com.javarush.island.zhidebaev.entities.Plant;
import com.javarush.island.zhidebaev.services.Randomizer;

import java.util.ArrayList;
import java.util.List;

// -- Создание острова --

public final class Island {
    private static final List<Cell> field = new ArrayList<>(); // -- Поля в виде списка ячеек --

    // -- Метод инициализации острова --
    public static void init(){
       List<Cell> field = makeField(); // -- создание острова в виде списка ячеек --
       printField(field); // -- отображение острова --
       addPlants(); // -- добавление растительности в каждую ячейку острова --
       AnimalFactory.addAnimals(); // -- добавление животных в каждую ячейку острова --


       printFieldTest(field); // -- тест отображение кол-ва животных в каждой локации --

    }

    // -- Метод создания списка ячеек острова --
    public static List<Cell> makeField() {
        System.out.print(IslandConstants.ISLAND_NAME);
        for (int i = 0; i < IslandConstants.MAX_WIDTH; i++) {
            for (int j = 0; j < IslandConstants.MAX_HEIGHT; j++) {
                field.add(new Cell(i,j));
            }
        }
        return field;
    }

    // -- Метод для отображения острова в виде списка ячеек с координатами --
    public static void printField(List<Cell> field) {
        for (int i = 0; i < field.size(); i++){
        if(i % IslandConstants.MAX_HEIGHT != 0) System.out.print(field.get(i));
        else System.out.print("\n"+field.get(i));
        }
        System.out.println("\n------------------------------");
    }

    // -- Метод получения ячейки по координатам (x,y) --
    public static Cell getCell (int x, int y){
        return field.stream()
                .filter(s ->(s.getX() == x))
                .filter(s ->(s.getY() == y))
                .toList()
                .get(0);
    }

    // -- метод добавления растительностей в каждую ячейку --
    public static void  addPlants(){
        for(Cell cell : field)
        for(int i = 0; i < Randomizer.randomNumber(120,180); i++) {
            cell.getPlants().add(new Plant(PlantsCharacteristics.plantsIcon,
                                           PlantsCharacteristics.plantsCharacter.get(0),
                                           PlantsCharacteristics.plantsCharacter.get(1)));
        }
    }

    public static void printFieldTest(List<Cell> field) {
        System.out.print("-Количество животных в каждой локации-");
        for (int i = 0; i < field.size(); i++){
            if(i % IslandConstants.MAX_HEIGHT != 0) System.out.print(" "+field.get(i).getAnimals().size()+" ");
            else System.out.print("\n "+field.get(i).getAnimals().size()+" ");
        }
        System.out.println("\n------------------------------");
    }

    public static List<Cell> getField(){
        List<Cell> listCell = new ArrayList<>(field);
        return listCell;
    }

//    public static int getAnimalsCount() {
//        int f = 0;
//        for (int i = 0; i < field.size()-1; i++){
//          f = field.get(i).getAnimals().size()+field.get(i+1).getAnimals().size();
//        }
//        return f;
//    }
}
