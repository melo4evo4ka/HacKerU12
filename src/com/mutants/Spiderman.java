package com.mutants;

import com.peoples.IronMan;
import com.peoples.Superman;

public class Spiderman {
    public static void breath() {
        System.out.println("breath");
    }
    protected static void jump(){
        System.out.println("jump");
    }
    static void runFast(){
        System.out.println("runFast");
    }
    protected static void shootWithCobwebs(){
        System.out.println("shootWithCobwebs");
    }
    public static void usePower(){
        shootWithCobwebs();
        breath();
        jump();
        runFast();
    }

    public static void main(String[] args) {
        System.out.println("SpiderMan__________________________");
        Spiderman.usePower();
        System.out.println("Deadpool___________________________");
        Deadpool.usePower();
        System.out.println("IronMan____________________________");
        IronMan.usePower();
        System.out.println("Superman___________________________");
        Superman.usePower();
    }
}
