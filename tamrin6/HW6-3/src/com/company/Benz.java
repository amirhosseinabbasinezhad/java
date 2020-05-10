package com.company;

public class Benz implements Car {
    public String model="cls 500";
    public String color="black";
    public double shetab = 5.2;

    @Override
    public void info(){
        System.out.println("BENZ  :");
        System.out.println("model:"+this.model);
        System.out.println("color:"+this.color);
        System.out.println("0 ta 100:"+this.shetab);
    }
}
