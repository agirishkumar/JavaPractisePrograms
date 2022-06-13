package com.girish;

import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int flg;

        for (int i = 2; i <=n; i++) {
            flg = 1;
            for (int j = 2; j*j <=i; j++) {
                if(i%j == 0){
                    flg =0;
                    break;
                }
            }
            if (flg == 1) {
                System.out.println(i + "");
            }

        }
    }
}
