package com.company;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

/*
- Создать метод public static void showTime(int hours) {…}, с параметром
кол-во часов - Внутри данного метода необходимо выводить время с помощью
команды System.out.println(hours + “ - часов, ” + 0 + “ - минут, ” + 0 + “ - секунд”)
- Создать метод showTime(int hours, int minutes), который будет принимать кол-во часов и минут -
Внутри данного метода необходимо выводить время с помощью команды
System.out.println(hours + “- часов, ” + minutes + “- минут, ” + 0 + “- секунд”)
- Добавить 3-ий аналогичный метод который будет принимать еще и секунды
- В методе public static void main(String[] args) { } необходимо вызывать каждый из созданных
методов, передав нужное кол-во параметров. - Запустить приложение и получить результат такого вида:

*** сделать так, чтобы команда System.out.println использовалась только 1 раз
 */
public class ShowTime {
    public static void main(String[] args) {
    showTime(5);
    showTime(2,30);
    showTime(7,45,34);

    }

    public static void showTime(int hours) {
        System.out.println(hours + " - часов, " + 0 + " - минут, " + 0 + " - секунд");
        printTime(hours+2,0,0);
    }
    public static void showTime(int hours, int minutes) {
        System.out.println(hours + " - часов, " + minutes + " - минут, " + 0 + " - секунд");
        printTime(hours+2,minutes+20,0);
    }
    public static void showTime(int hours, int minutes, int seconds) {
        System.out.println(hours + " - часов, " + minutes + " - минут, " + seconds + " - секунд");
        printTime(hours+2, minutes+20, seconds+20);
    }
    public static void printTime(int hours, int minutes, int seconds) {

    System.out.println(hours + " - часов, " + minutes + " - минут, " + seconds + " - секунд");

    }
}
