package com.petrolstation;

public class Order {
    public TypeOfGas typeOfGas;
    public Float litters;

    public TypeOfGas getTypeOfGas() {
        return typeOfGas;
    }

    public void setTypeOfGas(TypeOfGas typeOfGas) {
        this.typeOfGas = typeOfGas;
    }

    public Float getLitters() {
        return litters;
    }

    public void setLitters(Float litters) {
        this.litters = litters;
    }

    public Order(TypeOfGas typeOfGas, Float litters) {
        this.typeOfGas = typeOfGas;
        this.litters = litters;
    }
}
