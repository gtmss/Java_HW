package ch2;

import java.util.Scanner;

public class Ex_30_2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Eneter an integer number");
        int num = Input.nextInt();


        if (num / 10000 >= 1 && (num / 10000 <= 9.9999)) {
            int digit1 = num / 10000;
            num %= 10000;
            int digit2 = num / 1000;
            num %= 1000;
            int digit3 = num / 100;
            num %= 100;
            int digit4 = num / 10;
            num %= 10;
            int digit5 = num;

            System.out.printf("%d %d %d %d %d", digit1, digit2, digit3, digit4, digit5);
        } else System.out.println("Incorect format of number.\nPlaease,introduce 5 digit number.");

    }
}
