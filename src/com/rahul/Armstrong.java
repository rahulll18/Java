package com.rahul;

import java.util.Scanner;

public class Armstrong {

        public static void main(String[] args) {
            //Scanner in = new Scanner(System.in);

           // System.out.print("Enter the number :- ");
            //int num = in.nextInt();

            for(int i = 100 ; i < 1000 ; i++){
                if(isArmStrong(i)){
                    System.out.println(i);
                }
            }

//            boolean check = isArmStrong(num);
//            if(check){
//                System.out.println(num + " is armstrong");
//            }else{
//                System.out.println(num + " is not armstrong");
//            }
        }

        static boolean isArmStrong(int num){
            int orginalN = num;
            int ans = 0;
            while(num > 0){
                int rem =  num%10;
                num /= 10;
                ans = ans + rem * rem * rem;
            }
            return orginalN == ans;
        }

}
