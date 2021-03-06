package ch6;

import java.security.SecureRandom;
import java.util.Scanner;

public class Ex_30_6 {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        Scanner Input = new Scanner(System.in);
        int rand = random.nextInt(1,1000);
        int check = 1;
        int check2 = 1;
        int user;

        while (check == 1){
            while (check2 == 1) {
                System.out.println("Chose a number between 1 to 1000");
                user = Input.nextInt();
                check2 = displayResult(user, rand);

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
            System.out.println("Corecr ! Zero IN");
            result =  0;
        } else if (user > rand) {
            System.out.println("Too high!");
            result = 1;
        }
        else if (user < rand) {
            System.out.println("Too low!");
            result = 1;
        }

        return result;
    }
}
