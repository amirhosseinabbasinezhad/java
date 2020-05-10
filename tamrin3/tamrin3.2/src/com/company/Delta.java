package com.company;

public class Delta {
    double a;
    double b;
    double c;
    public double delta(double a,double b,double c)throws DeltaExeption{

        double f=(b*b)-(4*(a*c));
        if(f<0){
            throw new DeltaExeption("دلتا نمیتواند منفی باشد");
        }
        return f;
    }
    public void result(double a,double b,double delta)throws DeltaExeption{

        double deltaj=Math.sqrt(this.delta(a,b,c));
        double result1=((-b)+deltaj)/(2*a);
        double result2=((-b)-deltaj)/(2*a);
        System.out.format("x1=%f x2=%f",result1,result2);
    }
}
