package ch6;

import java.util.Scanner;

public class Ex_18_6 {
    public static void main(String[] args) {
        int number1;
        Scanner Input = new Scanner(System.in);


        while (true) {
            System.out.println("Introduce a dimension of square");
            number1 = Input.nextInt();
            if (number1 > 0)
                break;
            else System.out.println("Enter a pusitiv number");
        }
        squarOfAsterisks(number1);
    }

    static public void squarOfAsterisks(int num1) {
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num1; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
