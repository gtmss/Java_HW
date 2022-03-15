package ch2;

import java.util.Scanner;

public class Ex_15_2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);


        System.out.println("Introduce num1: ");
        int num1 = Input.nextInt();
        System.out.println("Introduce num2: ");
        int num2 = Input.nextInt();
        int sum = num1 + num2;
        int dif = num1 - num2;

        System.out.println();
        System.out.println("SUM: "+sum);
        System.out.println("DIFFERENCE: "+dif);
        if (num1 * num2 < Integer.MAX_VALUE){
            long product = num1 * num2;
            System.out.println("PRODUCT: "+product);
        } else System.out.println("Error. Too large resutt !");

        if (num2 != 0) {
            int quotient = num1 / num2;
            System.out.println("QUOTIENT: "+quotient);
        } else System.out.println("Division by 0!");

    }
}
