package com.company;

public class Run {
    int numberOfRunners;
    String stadiumName;
    double weather;

    public Run(int numberOfRunners, String stadiumName) {
        this(numberOfRunners,stadiumName,0);

    }

    public Run(int numberOfRunners, String stadiumName, double weather) {
        this.numberOfRunners = numberOfRunners;
        this.stadiumName = stadiumName;
        this.weather = weather;
    }


}
