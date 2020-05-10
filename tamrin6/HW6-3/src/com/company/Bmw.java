package com.company;

public class Bmw implements Car {
    public String model="i8";
    public String color="white";
    public double shetab = 4.4;

    @Override
    public void info(){
        System.out.println("BMW  :");
        System.out.println("model:"+this.model);
        System.out.println("color:"+this.color);
        System.out.println("0 ta 100:"+this.shetab);
    }
}
