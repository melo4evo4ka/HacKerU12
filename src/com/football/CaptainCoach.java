package com.football;

public interface CaptainCoach extends Captain , Coach {
    default void motivate(){
        System.out.println("Мотивирую игроков");
    }
}
