package com.petrolstation;

public class Car {
    // Сколько денег есть у водителя машины на бензин
    private Integer money;
    // Какой тип топлива используется в машине 95 или 98
    private TypeOfGas typeOfGas;
    // Текущее количества бензина
    private Float currentQuantityOfGas;
    // обьем бака
    private double vOb;

    public Car(Integer money, TypeOfGas typeOfGas, Float currentQuantityOfGas, double vOb) {
        this.money = money;
        this.typeOfGas = typeOfGas;
        this.currentQuantityOfGas = currentQuantityOfGas;
        this.vOb = vOb;
    }

    public Integer getMoney() {
        return money;
    }

    public TypeOfGas getTypeOfGas() {
        return typeOfGas;
    }

    public double getvOb() {
        return this.vOb;
    }

    public void setvOb(double vOb) {
        this.vOb = vOb;
    }

    public Car(double vOb) {
        this.vOb = vOb;
    }

    public Car(Integer money, TypeOfGas typeOfGas, Float currentQuantityOfGas) {
        this.money = money;
        this.typeOfGas = typeOfGas;
        this.currentQuantityOfGas = currentQuantityOfGas;
    }

    public Car(Integer money, float vOb) {
        float fullBackCoast;
        this.money = money;
        this.vOb = vOb;
        fullBackCoast = (float) (money*vOb);
        //return fullBackCoast;
    }

    // Добавить к текущему количеству бенизина количество купленное на заправке
    public void addGas(Float quantityOfGas) {
        currentQuantityOfGas += quantityOfGas;
    }
}
