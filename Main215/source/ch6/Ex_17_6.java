package ch6;

import java.util.Scanner;

public class Ex_17_6 {
    public static void main(String[] args) {
        int number1;
        String check;
        Scanner Input = new Scanner(System.in);

        System.out.println("Do you want tot check a number (yES or nO)?");
        check = Input.next();
        while (!check.equals("n")) {
            System.out.println("Introduce a number: ");
            number1 = Input.nextInt();

            System.out.printf("%b\n", isEven(number1));
            System.out.println("Do you want tot check a pair of numbers ?");
            check = Input.next();
        }
    }

    static public boolean isEven(int num1) {
        return num1 % 2 == 0;
    }
}
