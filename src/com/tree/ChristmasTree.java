package com.tree;

public class ChristmasTree extends ConiferTree {
    @Override
    public boolean hasLeaves() {
        return false;
    }

    @Override
    public String toString() {
        return "Елка - " + this.hasLeaves() + " Растет в россии - " + this.isGrowInRussia();
    }

    @Override
    boolean isGrowInRussia() {
        return true;
    }
}

