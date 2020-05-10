package com.company;

public class Ferrary implements Car {
    public String model="812 Super Fast";
    public String color="red";
    public double shetab = 2.9;

    @Override
    public void info(){
        System.out.println("FERRARY  :  :");
        System.out.println("model:"+this.model);
        System.out.println("color:"+this.color);
        System.out.println("0 ta 100:"+this.shetab);
    }
}
