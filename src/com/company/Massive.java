package com.company;

import java.sql.SQLOutput;

public class Massive {
    public static void main(String[] args) {
        String[] array = {" I", " like", " to", " program", " in", " Java"};
        String result = "";
        for (int i=0; i < array.length; i++)
        {
            if (i == 5 || i == 1 || i == 0) {
                result += array[i];

            }
        }
        System.out.println(result);
    }
}
