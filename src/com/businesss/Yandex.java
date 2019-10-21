package com.businesss;

public class Yandex {
    static Photostudio[] photostudios = new Photostudio[10];
    static void addNewPhotoStudio(Photostudio photostudio) {
        for (int i = 0; i <= photostudios.length; i++) {
        if (photostudios[i] == null)
        {
        photostudios[i] = photostudio;
        break;
        }
        }
    }
}
