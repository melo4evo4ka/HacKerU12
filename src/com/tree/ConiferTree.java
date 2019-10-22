package com.tree;

public abstract class ConiferTree implements Tree {
    @Override
    public boolean hasLeaves() {
        return true;
    }
    abstract boolean isGrowInRussia();
}
