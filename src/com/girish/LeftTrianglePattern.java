package com.girish;

import java.util.Scanner;

public class LeftTrianglePattern {
    static void leftTriangle(int k){

        int i,j;
        for( i=0; i<k; i++){
            for ( j = 2 * (k - i); j >= 0; j--) {
                // printing spaces
                System.out.print(" ");
            }

            // nested 3rd loop
            for ( j = 0; j <= i; j++) {
                // printing stars
                System.out.print("* ");
            }

            // end-line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int k =  sc.nextInt();
        leftTriangle(k);
    }
}
