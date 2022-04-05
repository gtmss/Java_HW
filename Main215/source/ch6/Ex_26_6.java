package ch6;

import java.util.Scanner;

public class Ex_26_6 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner Input = new Scanner(System.in);
        int number = Input.nextInt();
        revers(number);

    }

    public static void revers(int number) {
        while (number != 0) {
            int mod;
            mod = number % 10;
            System.out.print(mod);
            number /= 10;
        }
    }
}
