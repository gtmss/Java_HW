package ch5;

import java.util.Scanner;

public class Ex_16_5 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Introduce 5 numbers");
        int num1 = readNum();
        int num2 = readNum();
        int num3 = readNum();
        int num4 = readNum();
        int num5 = readNum();

        for (int i = 0; i < num1; i++)
            System.out.printf("*");
        System.out.println();
        for (int i = 0; i < num2; i++)
            System.out.printf("*");
        System.out.println();
        for (int i = 0; i < num3; i++)
            System.out.printf("*");
        System.out.println();
        for (int i = 0; i < num4; i++)
            System.out.printf("*");
        System.out.println();
        for (int i = 0; i < num5; i++)
            System.out.printf("*");


    }

    public static int readNum(){
        Scanner Input = new Scanner(System.in);
        int number;
        while (true){
            System.out.println("Introduce a number betwwen 1 and 30");
            number = Input.nextInt();
            if (number < 30 && number >= 1){
                break;
            }
        }
        return number;
    }
}
