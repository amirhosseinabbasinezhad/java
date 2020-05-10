package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NumberExeption {
        Scanner input= new Scanner(System.in);
        String text = input.nextLine();
        int counter=0;

        for (char a:text.toCharArray()) {
            counter++;
            if(a>='0'&&a<'9') {
                throw new NumberExeption();
            }

            }
        System.out.println(counter);
        }


    }

