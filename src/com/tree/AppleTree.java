package com.tree;

public class AppleTree extends DeciduousTree {
    @Override
    boolean hasFruits() {
        return true;
    }

    @Override
    public String toString() {return "Яблоня - " + this.hasLeaves() + " Фруктовое дерево - " + this.hasFruits() + " Есть листья - " + this.hasLeaves();}
   }
