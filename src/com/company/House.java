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
   /* public void coast(String color, int height)
    {

    }
    */


    public static void main(String[] args) {

        House dom1 = new House();
        House dom2 = new House();

        dom1.setColor("green");
        dom1.setHeight(14);
        dom2.setColor("red");
        dom2.setHeight(17);

        System.out.println(dom1.getColor() + " " + dom1.getHeight());
        System.out.println(dom2.getColor() + " " + dom2.getHeight());
    }

}
