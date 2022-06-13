package com.girish;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        int max = a;
        if (a<b){
            max = b;
        }
        if(c>b){
            max = c;
        }
        System.out.println("Max number is: "+max);
        int max1 = Math.max(Math.max(a,b),c);
        System.out.println("Max1 number is: "+max1);
    }
}
