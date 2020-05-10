package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        moadele x = new moadele();
        moadele y = new moadele();
        Scanner Scanner = new Scanner(System.in);
        System.out.println("ax+by=e\ncy+dy=f\nplease enter a,b,c,d.e,f");
        x.a = Scanner.nextFloat();
        x.b = Scanner.nextFloat();
        x.c = Scanner.nextFloat();
        x.d = Scanner.nextFloat();
        x.e = Scanner.nextFloat();
        x.f = Scanner.nextFloat();

        y.a = x.a;
        y.b = x.b;
        y.c = x.c;
        y.d = x.d;
        y.e = x.e;
        y.f = x.f;
        if ((x.a) / (x.c) == (y.b) / (y.d)) {
            System.out.println("bi javab");

        } else {
            System.out.println("x="x.resultx());
            System.out.println("y="y.resulty());
        }
    }
}