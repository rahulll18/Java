package com.rahul;

import java.util.Scanner;

public class Main {
    public static void add(int a , int b){
        a = a+2;
        System.out.println(a);
    }
    public static void main(String[] args) {
        add(2,4);

        Scanner input = new Scanner(System.in);
        System.out.println(input.nextLine());

        System.out.println(input.nextInt());


        int rollNo = 5;
        char letter = 'a';
        float marks = 5.55f;
        double d = 5555555.55;
        long largeInteger = 5555555555555555L;
    }

}