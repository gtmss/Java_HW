package ch4;

import java.util.Scanner;

public class Ex_18_4 {
    public static void main(String[] args) {
        int accountNumber;
        int beginBalance;
        int newBalance;
        int chargedItems;
        int chargedCredits;
        int allowedLimit;
        int counter = 0;
        String check;

        Scanner Input = new Scanner(System.in);

        System.out.println("Fo you want to infroduce some noew data about your account ?\n" +
                "press y - YES or n - NO");
        check = Input.next();

        while (!check.equals("n")){
            counter++;
            System.out.println("**************************************");
            System.out.println("Introduce ACCOUNT NUMBER: ");
            accountNumber = Input.nextInt();
            System.out.println("Introduce INITIAL BALANCE: ");
            beginBalance = Input.nextInt();
            System.out.println("Introduce TOTAL CHARGED ITEMS: ");
            chargedItems = Input.nextInt();
            System.out.println("Applied credits: ");
            chargedCredits = Input.nextInt();
            System.out.println("Credit limit: ");
            allowedLimit = Input.nextInt();
            newBalance = beginBalance + chargedItems - chargedCredits;
            System.out.printf("New balance for account %d is: %d\n", accountNumber,newBalance);

            if (newBalance > allowedLimit) {
                System.out.println("_________________________________");
                System.out.println("Credit limit exceed!");
                System.out.println("_________________________________");

            }
            System.out.println("Dou you want to add more data? Press yES or nO");
            check = Input.next();
        }
    }
}
