package com.figure;

/*
public abstract class FlatFigure extends Figure {
    abstract void flatten();

    @Override
    void draw() {
        System.out.println("Draw FlatFigure");
    }
}
*/

interface FlatFigure extends Figure {
    void flatten();

    @Override
    default void draw() {
        System.out.println("FlatFigure draw");
    }
}