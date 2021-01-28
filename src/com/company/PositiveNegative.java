package com.company;

public class PositiveNegative {
    public static void main(String[] args) {
    Number(5);
    Number(-6);
    Number(0);
    }

    public static void Number (int number) {
        if(number > 0) {
            System.out.println("The number is positive!");
        } else if (number < 0){
            System.out.println("The number is negative!");
        } else {
            System.out.println("The number is zero!");
        }
    }
}
