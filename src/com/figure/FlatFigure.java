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

public interface FlatFigure extends Figure{
void flatten();

    @Override
    void draw();
}