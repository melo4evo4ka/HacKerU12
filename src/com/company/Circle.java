package com.company;

public class Circle {
    public static void main(String[] args) {
        for (int i = 4; i >= 0;i--)
        { if(i==0)
            System.out.println(i + "- ноль");
            else if (i % 2 == 0)
                System.out.println(i + "- четное");
            else System.out.println(i + "- нечетное");
        }


    }
}
