package com.petrolstation;

public class PetrolStation {

    public void makeService() {
        Car car1 = new Car(1200, TypeOfGas.GAS_98, 0.0f);
        Car car2 = new Car(5000, TypeOfGas.GAS_95, 0.0f,53);
        Order order = Cashbox.createOrder(car1, TypeOfGas.GAS_98);
        car1.addGas(Dispenser.fillUp(order.getLitters()));

        Order order1 = Cashbox.createOrderFullBak(car2, TypeOfGas.GAS_98,  50.0);
        car2.addGas(Dispenser.fillUp(order.getLitters()));

        System.out.println();

    }

    public static void main(String[] args) {
        PetrolStation petrolStation = new PetrolStation();
        petrolStation.makeService();
    }
}
