package com.company;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter three numbers:");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a >= b && a >= c) {
            System.out.println("The biggest number is: " + a);
        } else if (b >= a && b >= c){
            System.out.println("The biggest number is: " + b);
        } else {
            System.out.println("The biggest number is: " + c);
        }


    }
}
