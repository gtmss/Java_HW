package ch6;

import java.util.Scanner;

public class Ex_16_6 {
    public static void main(String[] args) {
        int number1, number2;
        String check;
        Scanner Input = new Scanner(System.in);

        System.out.println("Do you want tot check a pair of numbers (yES or nO)?");
        check = Input.next();
        while (!check.equals("n")) {
            System.out.println("Introduce the multiple number: ");
            number1 = Input.nextInt();
            System.out.println("Intoduce base number: ");
            number2 = Input.nextInt();

            System.out.printf("%b\n", isMultiple(number1, number2));
            System.out.println("Do you want tot check a pair of numbers ?");
            check = Input.next();
        }
    }

    static public boolean isMultiple(int num1, int num2) {
        return num1 % num2 == 0;
    }
}
