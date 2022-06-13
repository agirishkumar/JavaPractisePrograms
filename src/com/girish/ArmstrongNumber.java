package com.girish;

import java.util.Scanner;

public class ArmstrongNumber {

    static void ArmstrongNum(int start, int end){
        for(int i=start+1; i<end; ++i){
            int y = i;
            int N = 0;
            while(y!=0){
                y =y/10;
                ++N;
            }

            int sum =0;
            y= i;
            while (y !=0){
                int x = y%10;
                sum += Math.pow(x,N);
                y /=10;
            }

            if (sum==i){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int x,digit = 1,start,end;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the starting number: ");
        start = sc.nextInt();
        System.out.println("enter the ending number: ");
        end = sc.nextInt();
        ArmstrongNum(start,end);
    }
}
