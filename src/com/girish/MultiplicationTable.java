package com.girish;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("MultiplicationTable of " + number);
        for (int i = 0; i < 20; i++) {
            System.out.println(number + " x " + i + " = " + number*i);
        }
    }
}
