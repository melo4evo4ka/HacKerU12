package com.company;

import java.util.Objects;

public class Airplane {
    int seatingCatacity;
    int fightRange;
    String company;

    public int getSeatingCatacity() {
        return seatingCatacity;
    }

    public void setSeatingCatacity(int seatingCatacity) {
        this.seatingCatacity = seatingCatacity;
    }

    public int getFightRange() {
        return fightRange;
    }

    public void setFightRange(int fightRange) {
        this.fightRange = fightRange;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Airplane(int seatingCatacity, int fightRange, String company) {
        this.seatingCatacity = seatingCatacity;
        this.fightRange = fightRange;
        this.company = company;
    }
    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
        @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof Airplane)) return false;
                Airplane airplane = (Airplane) o;
                int r = abs(seatingCatacity - airplane.seatingCatacity);
                int v = abs(fightRange - airplane.fightRange) ;
                    if ((r < 10) && ( v < 20)) {
                        return true;
                    }  else return false;
        }


    public static void main(String[] args) {
        Airplane S7 = new Airplane(110, 2003,"S7");
        Airplane UralAirlaines = new Airplane(105, 2005, "UralAirlines");
        System.out.println(S7.equals(UralAirlaines));
    }
}
