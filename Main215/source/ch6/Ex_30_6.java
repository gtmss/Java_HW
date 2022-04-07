package ch6;

import java.security.SecureRandom;
import java.util.Scanner;

public class Ex_30_6 {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        Scanner Input = new Scanner(System.in);
        int rand = random.nextInt(1,1000);
        int check = 1;
        int user;

        while (check == 1){
            System.out.println("Chose a number between 1 to 1000");
            user = Input.nextInt();
            displayResult(user, rand);
            System.out.println("Enter 1 if you want to play one more time, 0 - to exit");
            check = Input.nextInt();
        }
    }

    public static void displayResult(int user, int rand) {

    }
}
