package ch2;

import java.util.Scanner;

public class Ex_17_2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        // reading numbers
        System.out.println("Introduce num1: ");
        num1 = Input.nextInt();
        System.out.println("Introduce num2: ");
        num2 = Input.nextInt();
        System.out.println("Introduce num3: ");
        num3 = Input.nextInt();
        //calc
        int sum = num1 + num2 + num3;
        int average = sum / 3;
        int product = num1 * num2 * num3;
        System.out.println("Sum of these numbers is " +sum);
        System.out.println("Product of these numbers is " +product);
        System.out.println("Average of these numbers is " +average);

        if ((num1 > num2) && (num1 > num3)) {
            System.out.println("The largest is "+num1);
        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.println("The largest is "+num2);
        } else if ((num3 > num2) && (num3 > num1)) {
            System.out.println("The largest is "+num1);
        } else System.out.println("\nNumbers are equal");
    }
}
