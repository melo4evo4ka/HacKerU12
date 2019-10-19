package com.applince;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Kette extends Appliance {


    public static void fillWithWater(){
        System.out.println("Наливаю воду");
    }


    @Override
    void doWork() {
        System.out.println("Кипичу воду");
    }

}

