package com.rahul;

public class Scope {
    public static void main(String[] args) {
        int a;
        int b = 100;
        String name = "rahul";

        //block scope
        {
            //values initialised in the block will remain in the block in this case variable c
            int c = 4;
            a=555;
            b=2;
            name = "Rahul Avhad";
            {
                {
                    System.out.println(b);
                    System.out.println(c);
                    System.out.println(name);
                }
            }
        }

        int c =343434;
        //System.out.println(c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);
    }
}
