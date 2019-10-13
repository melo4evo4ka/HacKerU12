package com.mutants;

import com.people.IronMan;

public class Spiderman {
    public static void breath() {
        System.out.println("breath");
    }
    protected static void jump(){
        System.out.println("jump");
    }
    void runFast(){
        System.out.println("runFast");
    }
    private static void shootWithCobwebs(){
        System.out.println("shootWithCobwebs");
    }
    public static void usePower(){
        shootWithCobwebs();
        breath();
        jump();
    }

    public static void main(String[] args) {
        System.out.println("SpiderMan");
        Spiderman.usePower();
        System.out.println("Deadpool");
        Deadpool.usePower();
        IronMan.usePower();
    }
}
