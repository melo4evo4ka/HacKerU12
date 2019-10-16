package com.company;

import java.util.Objects;

/*
Почитать про hashCode https://habr.com/ru/post/168195/
Придумать и написать свою функцию hashCode для класса Dog.
У класса Dog должно быть 3 поля: String name, int age, int weight.
Для этого нужно переопределить метод hashCode(), стереть весь код который
находится внутри метода и написать свою реализацию. Основное требование к hashCode
заключается в том, чтобы для одинаковых объектов hashCode тоже был одинаковый, для
разных может быть как одинаковый так и разный.
 */
public class Dog {
    String name;
    int age;
    int weight;

    public Dog(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                weight == dog.weight &&
                Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode()+age+weight;
        return  result;

    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Корги",12,50);
        Dog dog2 = new Dog("Питбуль",15,70);
        Dog dog3 = new Dog("Корги",12,50);
        System.out.println(dog1.hashCode());
        System.out.println(dog2.hashCode());
        System.out.println(dog3.hashCode());
    }

}
