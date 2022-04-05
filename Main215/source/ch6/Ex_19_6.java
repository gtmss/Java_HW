package ch6;

import java.util.Scanner;

public class Ex_19_6 {
    public static void main(String[] args) {
        int number1;
        char fillCharacter;
        Scanner Input = new Scanner(System.in);


        while (true) {
            System.out.println("Introduce a dimension of square");
            number1 = Input.nextInt();
            if (number1 > 0)
                break;
            else System.out.println("Enter a pusitiv number");
        }
        System.out.println("Enter a character");
        fillCharacter = Input.next().charAt(0);
        squarOfAsterisks(number1, fillCharacter);
    }

    static public void squarOfAsterisks(int num1, char fillCharacter) {
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num1; j++) {
                System.out.printf("%c",fillCharacter);
            }
            System.out.println();
        }
    }
}
