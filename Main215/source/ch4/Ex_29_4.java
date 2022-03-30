package ch4;

import java.util.Scanner;

public class Ex_29_4 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        int squareSize;

        System.out.println("Enter the size of square value between 1 to 20");
        while (true){
            squareSize = Input.nextInt();
            if (squareSize >= 1 && squareSize <= 20){
                break;
            } else System.out.println("Introduce a value between 1 and 20");
        }

        for (int i = 0; i < squareSize; i++) {
            System.out.printf("*  ");
        }
        System.out.println();
        for (int i = 0; i < squareSize-2; i++) {
            System.out.printf("*");
            for (int j = 0; j < squareSize*3-4; j++) {
                System.out.printf(" ");
            }
            System.out.printf("*\n");
        }
        for (int i = 0; i < squareSize; i++) {
            System.out.printf("*  ");
        }
    }
}
