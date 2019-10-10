package com.company;

public class Run {
    int numberOfRunners;
    String stadiumName;
    double weather;

    public Run(int numberOfRunners, String stadiumName) {
        this (18,"sddsd",0);

    }

    public Run(int numberOfRunners, String stadiumName, double weather) {
        this.numberOfRunners = numberOfRunners;
        this.stadiumName = stadiumName;
        this.weather = weather;
    }

    public static void main(String[] args) {

        Run run1 = new Run(15,"lushniki",15);
        Run run2 = new Run(16,"alyansarena");


        System.out.println("Количество бегунов-" + run1.numberOfRunners);
        System.out.println("Погода - " + run1.weather);
        System.out.println("Название стадиона-" + run1.stadiumName);
        System.out.println("Количество бегунов - " + run2.numberOfRunners);
        System.out.println("Погода - " + run2.weather);
        System.out.println("Название стадиона-" + run2.stadiumName);

    }

}
