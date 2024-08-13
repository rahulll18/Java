package com.rahul;

import java.util.Arrays;

public class changeValue
{
    public static void main(String[] args) {
        int[] arr = {5,4,5,6,5,8};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        nums[0] = 55;
    }
}
