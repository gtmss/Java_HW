package ch7;

import java.util.Scanner;

public class Ex_14_7 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 22;
        int num5 = 12;
        int num6 = 9;
        int num7 = 7;
        int num8 = 4;

        System.out.println("Product of num1 and num2");
        product(num1, num2);
        System.out.println("Product of num1, num2 and num3, num4, num5");
        product(num1, num2, num3, num4, num5);
        System.out.println("Product of num6, num7 and num8");
        product(num6, num7, num8);

    }

    public static void product(int...nums){
        int total = 1;
        for (int i: nums ){
            total *= i;
        }
        System.out.println("Product = " +total);
    }
}
