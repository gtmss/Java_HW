package ch7;

import java.util.Scanner;

public class Ex_12_7 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter 5 digits\n");
        for (int i = 0; i < 5; i++) {


            while (true) {
                arr[i] = Input.nextInt();
                if (arr[i] >= 10 &&  arr[i] <= 100){
                    break;
                } else {
                    System.out.println("Enter a number between 10 and 100");
                }
            }

            int check = 0;
            if (i >= 1) {
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        check++;
                    }
                }
            }

            if (check == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
