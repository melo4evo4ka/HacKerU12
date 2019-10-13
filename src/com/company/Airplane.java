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
/*
    @Override
    public boolean equals(Object obj) {
        Airplane airplane;
        if (obj instanceof Airplane)
        { airplane = (Airplane) obj;
        return seatingCatacity == airplane.seatingCatacity &&
                fightRange == airplane.fightRange;
        return super.equals(obj);
    }
*/
        @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof Airplane)) return false;
                Airplane airplane = (Airplane) o;
                return seatingCatacity == airplane.seatingCatacity &&
                        fightRange == airplane.fightRange;
            }
/*
          /*  @Override
            public int hashCode() {
                return Objects.hash(seatingCatacity, fightRange, company);
            }
        */
    public static void main(String[] args) {
        Airplane S7 = new Airplane(100, 2003,"S7");
        Airplane UralAirlaines = new Airplane(100, 2003, "UralAirlines");
        System.out.println(S7.equals(UralAirlaines));
    }
}
