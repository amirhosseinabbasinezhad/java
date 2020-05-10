package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
	    BuildPerson buildPerson=new BuildPerson();
        System.out.println("Please enter your id:");
        buildPerson.setId(input.next());
        System.out.println("Please enter your fullname:");
        buildPerson.setName(input.next());
        System.out.println("please enter your password:");
        buildPerson.setPassword(input.next());
        System.out.println("please enter your home Addres:");
        buildPerson.setHomeAddres(input.next());
        System.out.println("please enter your phone number:");
        buildPerson.setPhonenumber(input.next());
        System.out.println("please enter your age:");
        buildPerson.setAge(input.nextInt());
        System.out.println("please enter your tahsilat:");
        buildPerson.setEdu(input.next());
        System.out.println("id,name,age,phone number");
        System.out.println(buildPerson.getId()+    buildPerson.getName()+     buildPerson.getAge()+     buildPerson.getPhonenumber());

    }
}
