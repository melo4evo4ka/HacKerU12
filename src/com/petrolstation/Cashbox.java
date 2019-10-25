package com.petrolstation;

public class Cashbox {
    private static Float PRICE_OF_95_GAS = 45.0f;
    private static Float PRICE_OF_98_GAS = 50.0f;

    public static Order createOrder(Car car, TypeOfGas typeOfGas) {
        float litters = 0.0f;
        if (typeOfGas == TypeOfGas.GAS_95)
        litters = car.getMoney() /  PRICE_OF_95_GAS;
        if (typeOfGas == TypeOfGas.GAS_98)
        litters = car.getMoney() /  PRICE_OF_98_GAS;
        System.out.println(litters);
    return new Order(car.getTypeOfGas(), litters);
    }

    public static Order createOrderFullBak(Car car, TypeOfGas typeOfGas, double v) {
        float fullBakCoast = 0;
        float litters = 0;
        if (typeOfGas == TypeOfGas.GAS_95)
        {
            //litters = car.getMoney() /  PRICE_OF_95_GAS;
            fullBakCoast = (float) (car.getvOb() * PRICE_OF_95_GAS);
        }
        if (typeOfGas == TypeOfGas.GAS_98)
        {
            //litters = car.getMoney() /  PRICE_OF_98_GAS;
           fullBakCoast = (float) (car.getvOb() * PRICE_OF_98_GAS);
        }
        double sdacha = car.getMoney() - fullBakCoast;
        System.out.println("Полный бак "+ car.getvOb() +" стоимость " + fullBakCoast );
        System.out.println("Выдать сдачу "+sdacha);
        return new Order(car.getTypeOfGas(), litters);
    }
}
