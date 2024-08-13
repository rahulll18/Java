package com.rahul;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {

        //to take input integer number
        Scanner input =  new Scanner(System.in);
        int rollNo = input.nextInt();
        System.out.println("Your roll number is :- " + rollNo);

        //for new entire string with spaces
        String name = input.nextLine();
        System.out.println("Your name is :- "+name);

        char inputChar = input.next().charAt(0);
        System.out.println("Entered Character is :- "+inputChar);

        //only for one string with no space
        String s = input.next();
        System.out.println("String you have entered :- "+s);
    }
}
