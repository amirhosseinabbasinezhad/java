package com.company;

public class Saipa implements Car {
    public String model="quick";
    public String color="blac";
    public double shetab =16.3;

    @Override
    public void info(){
        System.out.println("SAIP|A  :  :");
        System.out.println("model:"+this.model);
        System.out.println("color:"+this.color);
        System.out.println("0 ta 100:"+this.shetab);
    }
}
