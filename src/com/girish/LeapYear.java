package com.girish;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter a year number: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year%4 ==0) || ((year%100 !=0) && (year%4 == 0))) {
            System.out.println(year + ": is a leap year! ");
        }
        else {
            System.out.println(year + ": is not a leap year");
        }
    }
}
