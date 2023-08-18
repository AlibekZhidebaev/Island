package com.javarush.island.zhidebaev.entities;

import com.javarush.island.zhidebaev.constants.FeedingMap;
import com.javarush.island.zhidebaev.constants.IslandConstants;
import com.javarush.island.zhidebaev.island.Island;
import com.javarush.island.zhidebaev.island.Location;
import com.javarush.island.zhidebaev.services.Randomizer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class Animal extends Entity implements Cloneable{
    private final double speed; // -- скорость перемещения (не более чем, клеток за ход) --
    private final double satiety; // -- насыщение (в кг) --
    private Location locale; // -- местоположение --
    Map<String, Integer> feedingMap = FeedingMap.wolfFeedingMap; // -- Карта питания животного --


    protected Animal(String icon, double weight, double maxNumberOfSpecies, double speed, double satiety) {
        super(icon, weight, maxNumberOfSpecies);
        this.speed = speed;
        this.satiety = satiety;
    }
    public double getSpeed() {
        return speed;
    }
    public double getSatiety() {
        return satiety;
    }
    public Location getLocale() {
        return locale;
    }
    public void setLocale(Location locale) {
        this.locale = locale;
    }

    // -- метод кушать --
    public void eat() {
        List<Animal> animals = Island.getCell(locale.getX(), locale.getY()).getAnimals(); // -- Все животные в данной локации --
        List<Animal> eatable = new ArrayList<>(); // -- Животные в локации входящих в карту питания хищника --
        for (Animal animal : animals) {
            if (feedingMap.containsKey(animal.getClass().getSimpleName())) {
                eatable.add(animal);
            }
        }
        int numberVictims = eatable.size(); // -- Количество возможных жертв --
        // ---------------------------------------------------------------------------------

        System.out.println(animals.size());
        if (numberVictims != 0) {
            int victimIndex = Randomizer.randomListIndex(eatable.size()); // -- Позиция случайной жертвы --
            Animal victim = eatable.get(victimIndex); // -- Жертва по номеру позиции --
            String nameVictim = victim.getClass().getSimpleName(); // -- Имя жертвы в виде строки --
            boolean ate = Randomizer.victimEaten(feedingMap.get(nameVictim)); // -- Вероятность жертвы быть съеденным --
            System.out.println(ate);
            if (ate) {victim.die();} // -- Если жертва съедена, то удаляем его со списка животных в локации --
        }
        System.out.println(animals.size());
    }

    // -- метод передвигаться --
    //public  abstract void move();
    public void move() {
        List<Animal> animals = Island.getCell(locale.getX(), locale.getY()).getAnimals(); // -- Все животные в искомой локации --
        boolean moved = false;
        //int speed = Randomizer.getRandomSpeed(this.speed);
        int speed = 1;
        int x = this.locale.getX();
        int y = this.locale.getY();
        switch (Randomizer.getMove()) {
            case "up":
                x += speed;
                break;
            case "down":
                x -= speed;
                break;
            case "right":
                y += speed;
                break;
            case "left":
                y -= speed;
                break;
        }
        if (x >= 0 && y >= 0 && x < IslandConstants.MAX_HEIGHT && y < IslandConstants.MAX_WIDTH) {
            this.setLocale(new Location(x, y));
            moved = true;
        }
        if (moved) {
            animals.remove(this);
            Island.getCell(locale.getX(), locale.getY()).getAnimals().add(this);
            System.out.println("moved");
        } else System.out.println("no moved");
    }

    public void reproduse() {

        Animal animal = (Animal) super.clone();
        if(animal != null) {
            Island.getCell(locale.getX(), locale.getY()).getAnimals().add(animal);
            System.out.println("меня стало много");
        }
    }

    // -- метод вымирать --
    public void die(){
        Island.getCell(locale.getX(), locale.getY()).getAnimals().remove(this);
    }



    @Override
    public String toString() {
        return super.toString() +
                " Скорость передвижения = " + speed + " ячейки за такт " +
                "| Пища для насыщения = " + satiety + " кг |";
    }



}
