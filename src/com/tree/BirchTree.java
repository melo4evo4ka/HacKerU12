package com.tree;

public class BirchTree extends DeciduousTree {
    @Override
    boolean hasFruits() {
        return false;
    }

    @Override
    public String toString() {
        return "Береза - " + this.hasLeaves() + " Фруктовое дерево - " + this.hasFruits() + " Есть листья - " + this.hasLeaves();
    }
}
