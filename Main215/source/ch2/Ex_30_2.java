package ch2;

import java.util.Scanner;

public class Ex_30_2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Eneter an integer number");
        int num = Input.nextInt();
        int mod;

        while (num > 0){
            mod = num % 10;
            System.out.printf("%d ", mod);
            num = num / 10;
        }
    }
}
