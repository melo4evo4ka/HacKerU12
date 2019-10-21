package com.applince1;

public class Main {
    public static void main(String[] args) {
        Kette kette =new Kette();
        Dishwasher dishwasher =new Dishwasher();
        Appliance toster = new Appliance() {
            @Override
            public void doWork() {
                System.out.println("жарю");
            }

            @Override
            public void switchOff() {
                System.out.println("turnOFF");
            }
        };

        Appliance[] appliances = {kette,dishwasher,toster};
        for(Appliance a: appliances)
        {
            a.doWork();
            a.switchOff();
        }
     }
}
