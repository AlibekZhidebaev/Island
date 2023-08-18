package com.javarush.island.zhidebaev.Actions;

import com.javarush.island.zhidebaev.entities.Animal;

class AnimalSimulation implements Runnable {
    private Zoo animal;

    public AnimalSimulation(Zoo animal) {
        this.animal = animal;
    }

    @Override
    public void run() {

        while (!animal.isOld()) {

            if (animal.isHungry()) {
                animal.eat();

            }

            animal.move();
            animal.age();

            if (animal.canReproduce()) {
                animal.reproduce();
            }

            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
