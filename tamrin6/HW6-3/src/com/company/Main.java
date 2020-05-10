package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("for see BENZ enter (1) / BMW enter(2) /FERRARY enter (3)  / SAIPA enter (4)");
        Car car =CarFactory.getCar(input.nextInt());
        car.info();

    }
}
