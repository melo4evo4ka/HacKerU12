package com.football;

public class Player implements Goalkeeper,Defender,Midfielder,Forward,CaptainCoach {

    @Override
    public void scoreVeryRarely() {
        System.out.println("Забиваю очень редко");

    }

    @Override
    public void scoreRarely() {
        System.out.println("Забиваю редко");
    }

    @Override
    public void scoreOften() {
        System.out.println("Забиваю часто");
    }
}
