package com.company;

import java.util.Objects;

public class Laptop {
    String color;
    String brand;

    public Laptop() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Laptop(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(color, laptop.color) &&
                Objects.equals(brand, laptop.brand);
    }


    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop();
        laptop1.setBrand("Samsung");
        laptop1.setColor("Silver");
        laptop2.setBrand("HP");
        laptop2.setColor("Silver");

        System.out.println(laptop1.getBrand() == laptop2.getBrand());
        System.out.println(laptop1.getColor() == laptop2.getColor());
        laptop2.setBrand("Samsung");
        System.out.println(laptop1.getBrand() == laptop2.getBrand());
        System.out.println(laptop1 == laptop2);
        System.out.println(laptop1.equals(laptop2));

    }

}
