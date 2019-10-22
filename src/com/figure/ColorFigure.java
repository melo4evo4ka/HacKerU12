package com.figure;

/*
public abstract class ColorFigure extends Figure
{
abstract void paint();

    @Override
    void draw() {
        System.out.println("draw ColorFigure");
    }
}
*/
interface ColorFigure extends Figure
{
    default void paint() {
    }
}