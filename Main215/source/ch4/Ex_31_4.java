package ch4;

import java.util.Scanner;

public class Ex_31_4 {
    public static void main(String[] args) {
        long num;
        long remainder;
        int decimalNumber = 0;
        int i =0;
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter a binary equvalent of a decimal number");
        num = Input.nextLong();
        System.out.printf("%d = ",num);

        while (num != 0) {
            remainder = num % 10;
            num /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }

        System.out.printf("%d", decimalNumber);
    }
}
