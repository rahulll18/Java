package com.rahul;

import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        fun(5,6,5,82,8,42);
        funS("hello    " , "javaspring  " , "    soringboot");
    }

    //variable length of arguments
    static void fun(int ...v){

        for (int i = 0 ; i < v.length ; i++){
            System.out.print(v[i] + " ");
        }
        //System.out.println(Arrays.toString(v));
    }

    static void funS(String ...v){
        System.out.println(v[0]);
        //System.out.println(Arrays.toString(v));
    }

    static void funCh(char ...v){
        System.out.println(Arrays.toString(v));
    }
}
