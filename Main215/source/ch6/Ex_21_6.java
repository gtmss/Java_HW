package ch6;

import java.util.Scanner;

public class Ex_21_6 {
    public static void main(String[] args) {
        int number, integerA, integerB;
        Scanner Input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number which you want to split");
            number = Input.nextInt();
            if (number >= 1 && number <= 99999)
                break;
            else System.out.println("Allowed range, between 1 and 99999");
        }

        System.out.println("Enter integer A");
        integerA = Input.nextInt();
        System.out.println("Enter integer B");
        integerB = Input.nextInt();

        //result
        System.out.println("Integer part of quotient = "+quotient(integerA, integerB));
        System.out.println("Integer part of reminder = "+reminder(integerA, integerB));
        displayDigits(number);
    }

    public static int quotient(int a, int b) {
        return a / b;
    }

    public static int reminder(int a, int b) {
        return a % b;
    }

    public static void displayDigits(int number) {
        int ten = 10000;
        while (number != 0) {
            System.out.print(" " +quotient(number, ten));
            number = reminder(number, ten);
            ten = quotient(ten, 10);
        }
    }

}
