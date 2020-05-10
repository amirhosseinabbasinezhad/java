package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Student stu=new Student();
        Scanner input = new Scanner(System.in);
        System.out.println("name is :amir/nusername is :amir_abbasi/npasswordis:amir0023");
        System.out.println("please enter name");
        stu.name=input.nextLine();
        System.out.println("please enter username");
        stu.username=input.nextLine();
        System.out.println("please enter name");
        stu.password=input.nextLine();
        try {
            stu.studentname(stu.name);
        }
        catch (ExeptionName exeptionName){
        exeptionName.printStackTrace();
        }
        try {
            stu.username(stu.username);
        }
        catch (ExeptionName exeptionName){
            exeptionName.printStackTrace();
        }
        try {
            stu.password(stu.password);
        }
        catch (ExeptionName exeptionName){
            exeptionName.printStackTrace();
        }
    }
}
