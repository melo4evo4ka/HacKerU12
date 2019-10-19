package com.applince;

public class Appliance {

   // private static Object Kette;
    //private static Object Dishwasher;

    void doWork(){

    }
    void switchOff()
    {
        System.out.println("Выключаюсь");
    }

    public static void main(String[] args) {
        Kette kette =new Kette();
        Dishwasher dishwasher =new Dishwasher();
        Appliance[] appliances = {kette,dishwasher};

        for(Appliance a: appliances)
        {   
            kette.fillWithWater();
            a.doWork();
            a.switchOff();
        }

      /*  for (int i = 0;i < appliances.length; i++)
        {
        appliances[i].doWork();
        appliances[i].switchOff();
        }
        */

    }
}
