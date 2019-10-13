package com.applince1;

public class Dishwasher implements Appliance {
    @Override
    public void doWork() {

        System.out.println("Мою посуду");
    }

    @Override
    public void switchOff() {
        System.out.println("Выключаюсь");

    }
}
