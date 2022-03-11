package ch2;

import java.util.Scanner;

public class Ex_15_2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        System.out.println("Introduce num1: ");
        num1 = Input.nextInt();
        System.out.println("Introduce num2: ");
        num2 = Input.nextInt();
        int sum = num1 + num2;
        int product = num1 * num2;
        int dif = num1 - num2;
        int quotient = num1 / num2;

        System.out.println();
        System.out.println("SUM: "+sum);
        System.out.println("PRODUCT: "+product);
        System.out.println("DIFFERENCE: "+dif);
        System.out.println("QUOTIENT: "+quotient);
    }
}
