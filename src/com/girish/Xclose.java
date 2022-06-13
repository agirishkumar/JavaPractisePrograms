package com.girish;

import java.util.Scanner;

public class Xclose {
    public static void main(String[] args) {
        System.out.println("Give your input character /  press X to close : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if (!input.trim().equals("X")){
            System.out.println("enter input again");
            input = sc.next();
        }
        else {
            System.out.println("Closed");
        }
    }
}
