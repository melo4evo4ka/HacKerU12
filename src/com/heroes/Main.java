package com.heroes;

import com.heroes.mutants.Deadpool;
import com.heroes.mutants.Spiderman;
import com.heroes.peoples.IronMan;
import com.heroes.peoples.Superman;

public class Main {
    public static void main(String[] args) throws Exception {
        Spiderman spiderman = new Spiderman();
        System.out.println("SpiderMan__________________________");
        spiderman.usePower();
        Deadpool deadpool = new Deadpool();
        System.out.println("Deadpool___________________________");
        deadpool.usePower();
        IronMan ironMan = new IronMan();
        System.out.println("IronMan____________________________");
        ironMan.usePower();
        Spiderman superman = new Superman();
        System.out.println("Superman___________________________");
        superman.usePower();
    }
}
