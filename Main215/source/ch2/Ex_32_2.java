package ch2;

import java.util.Scanner;

public class Ex_32_2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Inyroduce 5 numbers:");
        int num1 = Input.nextInt();
        int num2 = Input.nextInt();
        int num3 = Input.nextInt();
        int num4 = Input.nextInt();
        int num5 = Input.nextInt();

        int negativ = 0;
        int positiv = 0;
        int zero = 0;

        if (num1 > 0) {
            positiv++;
        } else if (num1 < 0) {
            negativ++;
        } else zero++;

        if (num2 > 0) {
            positiv++;
        } else if (num2 < 0) {
            negativ++;
        } else zero++;

        if (num3 > 0) {
            positiv++;
        } else if (num3 < 0) {
            negativ++;
        } else zero++;

        if (num4 > 0) {
            positiv++;
        } else if (num4 < 0) {
            negativ++;
        } else zero++;

        if (num5 > 0) {
            positiv++;
        } else if (num5 < 0) {
            negativ++;
        } else zero++;

        System.out.printf("%d positiv numbers\n", positiv);
        System.out.printf("%d neagtiv numbers\n", negativ);
        System.out.printf("%d zero numbers\n", zero);

    }
}
