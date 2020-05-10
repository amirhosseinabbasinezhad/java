package com.company;

import java.util.Scanner;

public class SabtName {
    Scanner input= new Scanner(System.in);
    Info info=new Info();
    private static SabtName sabtName = new SabtName();
    public static SabtName getInstance(){return sabtName;}
    private SabtName(){}
    public void Create(){
        System.out.println("please enter your name");
        info.setName(input.next());
        System.out.println("please enter your family");
        info.setFamily(input.next());
        System.out.println("please enter your age");
        info.setAge(input.nextInt());
        System.out.println("please enter your email");
        info.setEmail(input.next());
        System.out.println("<<successful registration>>");
    }
    public void Show(){
        System.out.println();
        System.out.println("name:");
        System.out.println(info.getName());
        System.out.println();
        System.out.println("family:");
        System.out.println(info.getFamily());
        System.out.println();
        System.out.println("age:");;
        System.out.println(info.getAge());
        System.out.println();
        System.out.println("email:");
        System.out.println(info.getEmail());
    }


}