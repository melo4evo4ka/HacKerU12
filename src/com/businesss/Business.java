package com.businesss;

public class Business implements Photostudio,KeyCutting {
    private String phStudioName;

    public Business(String phStudioName) {
        this.phStudioName = phStudioName;
    }

    @Override
    public void makeSignboard() {
        System.out.println("makeSignboard");
    }

    @Override
    public String toString() {
        return "Бизнес {" +
                "Фотостудия ='" + phStudioName + '\'' +
                '}';
    }

    @Override
    public void getLicence() {
        System.out.println("getLicence");
    }

    @Override
    public void addToYandexMap(Photostudio photostudio) {
        System.out.println("addToYandexMap");
        Yandex.addNewPhotoStudio(photostudio);
    }

    @Override
    public void findKeyMaster() {
        System.out.println("findKeyMaster");
    }
}


