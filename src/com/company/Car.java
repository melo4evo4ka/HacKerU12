package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Car {
int maxSpeead;

    public Car(int maxSpeead) {
        this.maxSpeead = maxSpeead;
    }

    public void setMaxSpeead(int maxSpeead) {
        this.maxSpeead = maxSpeead;
    }

    public static void main(String[] args) {
        Car car1 = new Car(100);
        Car car2 = car1;

        System.out.println(car1.maxSpeead + "=" + car2.maxSpeead);
        car2.setMaxSpeead(200);
        System.out.println(car1.maxSpeead + "=" + car2.maxSpeead);
        car1.setMaxSpeead(100);
        car2 = new Car(100);
        System.out.println(car1.maxSpeead + "=" + car2.maxSpeead);
        car2.setMaxSpeead(200);
        System.out.println(car1.maxSpeead + "=" + car2.maxSpeead);

    }
}
