package com.company;

public class Grades {
    public String name;

    public void avg(int g, int z, int g2, int z2) {

        int avg = (g * z) + (g2 * z2);
    }

    public int avg(int g, int z, int g2, int z2, int g3, int z3) {
        int avg = (g * z) + (g2 * z2) + (g3 * z3);
        return avg;
    }

    public int avg(int g, int z, int g2, int z2, int g3, int z3, int g4, int z4) {
        int avg = (g * z) + (g2 * z2) + (g3 * z3) + (g4 * z4);
        return avg;
    }

    public int avg(int g, int z, int g2, int z2, int g3, int z3, int g4, int z4, int g5, int z5) {
        int avg = (g * z) + (g2 * z2) + (g3 * z3) + (g4 * z4) + (g5 + z5);
        return avg;
    }

    public int avg(int g, int z, int g2, int z2, int g3, int z3, int g4, int z4, int g5, int z5, int g6, int z6) {
        int avg = (g * z) + (g2 * z2) + (g3 * z3) + (g4 * z4) + (g5 + z5) + (g6 * z6);
        return avg;
    }
}

