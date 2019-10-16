package com.extend;
/*
- Создать класс Grandfather с полем String livingPlace и методом knowsWhoIsLenin()
реализацию метода сделать через sout
- Создать класс Father, который наследуется от Grandfather и имеет свой собственный метод listenTheBeatles()
реализацию метода сделать через sout
- Создать класс Son, который наследуется от Father и имеет метод learnJava()
реализацию метода сделать через sout
- Создать класс Daughter, который наследуется от Father и имеет метод learnJavaAndSql(),
реализацию метода сделать через sout
- В методе main cоздать объекты всех вышеперечисленных классов в порядке перечисления, а также обратиться
ко всем доступным полям и методам для каждого объекта. - Запустить приложение

* сделать так, чтобы дети могли одновременно иметь доступ к методам и от Father и от Mother.
Реализацию Mother сделать на свое усмотрение. Доступ к Mother получать любым способом.
 */

public class Grandfather extends Mother {
    String livingPlace;

    public static void khowsWhoIsLenin()
    {
        System.out.println("khowsWhoIsLenin");
    }

    public static void main(String[] args) {
        System.out.println("-------------------Grandfather");
        Grandfather.khowsWhoIsLenin();
        System.out.println("-------------------father");
        Father.listenTheBeatles();
        Father.khowsWhoIsLenin();
        System.out.println("-------------------Mother");
        Mother.readCookbook();
        System.out.println("-------------------Son");
        Son.learnJava();
        Son.khowsWhoIsLenin();
        Son.listenTheBeatles();
        Son.readCookbook();
        System.out.println("-------------------Daughter");
        Daughter.learnJavaAndSql();
        Daughter.listenTheBeatles();
        Daughter.khowsWhoIsLenin();
        Daughter.readCookbook();
    }
}
