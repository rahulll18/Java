package com.rahul;

import java.util.Scanner;

public class Tempreature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Tempreature in degree celcius");

        float temp = input.nextFloat();
        float ans = ((temp * 9)/5 )+ 32;
        System.out.println("Tempreature in Farade is :- "+ans);
    }
}
