package ch5;

import java.util.Scanner;

public class Ex_11_5 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int numbers;
        int value;
        int min = Integer.MAX_VALUE;

        System.out.println("How many values do you want to compare ?");

        while (true){
            numbers = Input.nextInt();
            if (numbers > 0) {
                break;
            } else System.out.println("Please, introduce a positive value!");
        }

        System.out.println("Introduce a value:");
        for (int i = 0; i < numbers; i++) {
            value = Input.nextInt();
            if (value < min)
                min = value;
        }
        System.out.println("Minimal value is: "+min);

    }
}
