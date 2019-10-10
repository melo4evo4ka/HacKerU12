package com.company;

public class Main {

    public static void main(String[] args) {

        Run run1 = new Run(15,"lushniki",15);
        Run run2 = new Run(16,"alyansarena");

        //  Cat catMyua1 = new Cat("red");
        //Cat catMyua2 = new Cat("red","TOM");
        //Cat catMyua3 = new Cat("green","dom",6);
        //System.out.println("catMyua1");
        //
        // write your code here
        System.out.println("Количество бегунов-" + run1.numberOfRunners);
        System.out.println("Погода - " + run1.weather);
        System.out.println("Название стадиона-" + run1.stadiumName);
        System.out.println("Количество бегунов - " + run2.numberOfRunners);
        System.out.println("Погода - " + run2.weather);
        System.out.println("Название стадиона-" + run2.stadiumName);

    }
}
