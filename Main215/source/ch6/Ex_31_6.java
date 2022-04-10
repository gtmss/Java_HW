package ch6;

import java.security.SecureRandom;
import java.util.Scanner;

public class Ex_31_6 {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        Scanner Input = new Scanner(System.in);
        int rand = random.nextInt(1,1000);
        int check = 1;
        int check2 = 1;
        int user;


        while (check == 1){
            int counter = 0;

            while (check2 == 1) {
                System.out.println("Chose a number between 1 to 1000");
                user = Input.nextInt();
                check2 = displayResult(user, rand);
                counter++;
                guessDisplay(check2, counter);
            }
            System.out.println("Enter 1 if you want to play one more time, 0 - to exit");
            check = Input.nextInt();
            if (check == 1) {
                check2 = 1;
                rand = random.nextInt(1, 1000);
            }

        }
        System.out.println("Correct answer was "+rand);
    }

    public static int displayResult(int user, int rand) {
        int result = 0;
        if (user == rand) {
            System.out.println("Congradulations. You guessed the number !");
            result =  0;
        } else if (user > rand) {
            System.out.println("Too high!");
            System.out.println("Try again.");
            result = 1;
        }
        else if (user < rand) {
            System.out.println("Too low!");
            result = 1;
        }

        return result;
    }

    public static void guessDisplay(int result, int counter) {
        if (result == 0 && counter == 10 ) {
            System.out.println("Aha! You know the secret!");
        } else if (result == 0 && counter < 10) {
            System.out.println("Either you know the secret or you got lucky!");
        } else if (counter > 10)
            System.out.println("You should be able to do better!");
    }
}
