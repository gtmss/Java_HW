package ch4;

import java.util.Scanner;

public class Ex_19_4 {
    public static void main(String[] args) {
        final int stableWeek = 200;
        int counter = 0;
        int salespersonID = 0;
        double grossSales = 0;
        double itemPrice;
        double totalWeek;
        String check;

        Scanner Input = new Scanner(System.in);
        System.out.println("Do you want to list some sold items ?\n" + "press y - YES or n - NO");
        check = Input.next();

        while (!check.equals("n")) {
            salespersonID++;
            System.out.println("How much items have been sold this week? ");
            counter = Input.nextInt();

            if (counter > 0) {
                for (int i = 1; i < counter+1; i++) {
                    System.out.printf("Introduce value of the item %d\n", i);
                    itemPrice = Input.nextDouble();
                    grossSales += itemPrice;
                }
            } else System.out.println("Number of sold items should be positive.");
            //calculations
            totalWeek = stableWeek + (9 * grossSales * 0.01);
            System.out.println("*********************************************************");
            System.out.printf("Saleperson(ID: %d) earnings for this week: %.2f\n", salespersonID, totalWeek);
            System.out.println("*********************************************************");

            itemPrice = 0;
            grossSales = 0;

            System.out.println("Dou you want to add data for another salesman ? Press yES or nO");
            check = Input.next();
        }
    }
}
