package com.heroes.mutants;

import com.heroes.peoples.IronMan;
import com.heroes.peoples.Superman;

public class Spiderman {
    public void breath() {
        System.out.println("breath");
    }
    protected void jump(){
        System.out.println("jump");
    }
    protected void runFast(){
        System.out.println("runFast");
    }
    private void shootWithCobwebs(){
        System.out.println("shootWithCobwebs");
    }
    public void usePower(){
        shootWithCobwebs();
        breath();
        jump();
        runFast();
    }


}
