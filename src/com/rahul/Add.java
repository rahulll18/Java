package com.rahul;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //priority range in data type
        //int <<< float

        int num3 = input.nextShort();
        float num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("Sum is :- " + (num1 + num2));
    }
}
