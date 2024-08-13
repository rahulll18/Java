package com.rahul;

public class Shadowing {
    static int x = 55;
    static int var = 5656;

    public static void main(String[] args) {
        int x = 54545; //this variable shadowed by line 4 variable
        System.out.println(x);

        int var; //declaring variable and shadowing begins from here
        var = 45454;
        fun();
    }

    static void fun(){
        System.out.println(x);
    }

}
