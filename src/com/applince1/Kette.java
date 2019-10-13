package com.applince1;

public class Kette implements Appliance {
    @Override
    public void doWork() {
        System.out.println("Кипичу воду");
    }

    @Override
    public void switchOff() {
        System.out.println("Выключаюсь");
    }
}
