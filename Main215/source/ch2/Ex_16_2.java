package ch2;

import java.util.Scanner;

public class Ex_16_2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        System.out.println("Introduce num1: ");
        num1 = Input.nextInt();
        System.out.println("Introduce num2: ");
        num2 = Input.nextInt();

        if (num1 > num2) {
            System.out.printf("%d is larger", num1);
        } else if (num1 < num2) {
            System.out.printf("%d is larger", num2);
        } else System.out.println("Numbers are equal");
    }
}
