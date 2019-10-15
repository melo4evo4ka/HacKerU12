package com.company;

public class House {
    String color;
    int height;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String t ="light";
        this.color = t+color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height*100;
    }

    // TODO метод не учитывает поле COLOR
        public static int coast(int height, String color)
    {
        int c; //коэффициэнт стоимости цвета
        int coast = 40; //стомсость кв.м
        switch (color){
            case "lightred" : c = 20;
            break;
            case "lightgreen" : c = 30;
            break;
            case "lightblue" : c = 40;
            break;
            case "lightgray" : c = 50;
            break;
            case "lightblack" : c = 60;
            break;
            default: c = 10;
            break;
        }
        coast = height*coast*c;
        return coast;
    }
    public static void main(String[] args) {
        House dom1 = new House();
        House dom2 = new House();
        dom1.setColor("green");
        dom1.setHeight(17);
        dom2.setColor("red");
        dom2.setHeight(17);
        System.out.println(dom1.getColor() + " " + dom1.getHeight() + " " + dom1.coast(dom1.height,dom1.color));
        System.out.println(dom2.getColor() + " " + dom2.getHeight() + " " + dom2.coast(dom2.height,dom2.color));
    }

}
