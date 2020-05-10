package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Delta d1=new Delta();
       // DeltaExeption d5=new DeltaExeption();
        Scanner input=new Scanner(System.in);
        System.out.println("ax^2+bx+c");
        System.out.println("please enter a");
        d1.a=input.nextInt();
        System.out.println("please enter b");
        d1.b=input.nextInt();
        System.out.println("please enter c");
        d1.c=input.nextInt();

        try {
            d1.delta(d1.a,d1.b,d1.c);
        } catch (DeltaExeption deltaExeption) {
            deltaExeption.printStackTrace();
        }


    }
}
