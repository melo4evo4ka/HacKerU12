package com.football;

public interface Goalkeeper {
    default void scoreVeryRarely()
    {
        System.out.println("Забиваю очень редко");
    }
}
