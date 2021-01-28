package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter day:");
        int dayNumber = scanner.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("You entered " + dayNumber + " so week day is Monday!");
                break;
            case 2:
                System.out.println("You entered " + dayNumber + " so week day is Tuesday!");
                break;
            case 3:
                System.out.println("You entered " + dayNumber + " so week day is Wednesday!");
                break;
            case 4:
                System.out.println("You entered " + dayNumber + " so week day is Thursday!");
                break;
            case 5:
                System.out.println("You entered " + dayNumber + " so week day is Friday!");
                break;
            case 6:
                System.out.println("You entered " + dayNumber + " so week day is Saturday!");
                break;
            case 7:
                System.out.println("You entered " + dayNumber + " so week day is Sunday!");
                break;
        }


    }


}
