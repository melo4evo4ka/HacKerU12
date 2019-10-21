package com.businesss;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Business biss1 = new Business("Konika");
        Business biss2 = new Business("PhotoPC");
        Photostudio[] photostudios = {biss1,biss2};
        KeyCutting[] keyCuttings = {biss1,biss2};

        for(Photostudio a: photostudios)
        {
            a.addToYandexMap(a);
            a.getLicence();
            a.makeSignboard();
        }
        for (KeyCutting a: keyCuttings)
        {
           a.findKeyMaster();
        }
        System.out.println(Arrays.toString(Yandex.photostudios));

    }
}
