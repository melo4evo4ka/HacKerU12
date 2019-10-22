package com.tree;

public abstract class DeciduousTree implements Tree {
    abstract boolean hasFruits();
    @Override
    public boolean hasLeaves() {
        return true;
    }
}