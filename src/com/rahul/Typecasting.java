package com.rahul;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         //float a = input.nextFloat();
//        System.out.println(a);

        //type casting
        System.out.println("hello world");
        int b = (int)(55.89f);
        System.out.println(b);

        int number = 'A';
        System.out.println(number);

        char ch = 65;
        System.out.println(ch);

        byte by = (byte)260;  //260 % 256 = 4

        System.out.println(by);

    }
}
