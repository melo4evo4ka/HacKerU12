package com.extend;

public class Grandfather {
    String livingPlace;

    public static void khowsWhoIsLenin()
    {
        System.out.println("khowsWhoIsLenin");
    }

    public static void main(String[] args) {
        Grandfather.khowsWhoIsLenin();
        Son.learnJava();
        Son.khowsWhoIsLenin();

    }
}
