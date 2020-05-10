package com.company;

public class CarFactory {
    public static Car getCar(int a){
        switch (a){
            case 1:
                return new Benz();
            case 2:
                return new Bmw();
            case 3:
                return new Ferrary();
            case 4:
                return new Saipa();
            default:
                return null;
        }
    }
}
