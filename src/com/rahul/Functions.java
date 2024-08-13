package com.rahul;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        System.out.println("Learning functions");
        //add();
        Character s = fun();
        System.out.println(s);
    }

    static void add(){
        //DRY concept :- Don't repeat
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int ans =   a+b;
        System.out.println("Your Sum is :- " + ans);
    }

    //return a string
    static char fun(){
        return 'C';
    }
}
