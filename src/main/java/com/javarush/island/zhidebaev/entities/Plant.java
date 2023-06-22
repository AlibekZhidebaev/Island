package com.javarush.island.zhidebaev.entities;


public class Plant {
    private final String icon= "РАСТЕНИЕ";
    int weight = 1; // -- вес (в кг)--
    int maxNumberOfSpecies = 200; // -- Максимальное количество в одной клетке --
    public Plant(){
    }
   public void reproduse() {
        System.out.println("я размножаюсь");
    }

    @Override
    public String toString() {
        return   "\n" + this.getClass().getSimpleName() + " => " +
                "| Вес = " + weight + " кг " +
                "| Максимальное количество в ячейке = " + maxNumberOfSpecies + " особей |";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Plant) super.clone();
    }
}
