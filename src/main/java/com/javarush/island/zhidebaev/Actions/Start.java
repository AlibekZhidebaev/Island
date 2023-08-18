package com.javarush.island.zhidebaev.Actions;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Start extends Thread {
    private int day = 1;
    List<Zoo> animals = List.of(new Zoo("Animal1"), new Zoo("Animal2"), new Zoo("Animal3"));

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("-".repeat(15) + "\n   ДЕНЬ: = " + day++ +"\n"+"-".repeat(15));
            synchronized (this) {


               ExecutorService executor = Executors.newFixedThreadPool(5);
               for (Zoo animal : animals) {
                   executor.submit(new AnimalSimulation(animal));
               }
               executor.shutdown();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Поток был прерван.");
            }
           }
        }
    }


}
