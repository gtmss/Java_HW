package ch4;

import java.util.Scanner;

public class Ex_23_4 {
    public static void main(String[] args) {
        int[] units = new int[10];
        int number;
        int largest;
        int lastLargest = 0;

        Scanner Input = new Scanner(System.in);

        System.out.println("Introduce 10 integers");
        for (int counter = 0; counter < 10; counter++) {
            number = Input.nextInt();
            units[counter] = number;
        }

        largest = units[0];
        for (int counter = 0; counter < 10; counter++) {
            if (units[counter] > largest)
                lastLargest = largest;
                largest = units[counter];
        }

        System.out.println(">>>>>>>>> TWO LARGEST NUMBERS ARE:" +largest + " and "+ lastLargest);
    }
}
