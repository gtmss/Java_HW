package ch4;

import java.util.Scanner;

public class Ex_17_4 {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        int gallons;
        int totalGallons = 0;
        int miles;
        int totalMiles = 0;
        int tripCounter = 0;
        String check;

        System.out.println("Fo you want to infroduce some noew data about your trips ?\n" +
                "press y - YES or n - NO");
        check = Input.next();

        while (!check.equals("n")){
            tripCounter++;
            System.out.printf("Trip number: %d\n", tripCounter);
            System.out.println("How much MILES ?");
            miles = Input.nextInt();
            System.out.println("How about GALLONS ?");
            gallons = Input.nextInt();
            System.out.printf("Fuel consumption: %.2f\n", (double)miles/gallons);
            totalMiles += miles;
            totalGallons += gallons;

            System.out.println("Dou you want to add a new trip ? Press yES or nO");
            check = Input.next();
        }

        //Combined consuption.

        System.out.println("****************************************");
        System.out.printf("Total miles: %d\n", totalMiles);
        System.out.printf("Total gallons: %d\n", totalGallons);
        System.out.printf("Combined fuel consumption: %.2f miles/gallons\n", (double)totalMiles/totalGallons);
    }

}
