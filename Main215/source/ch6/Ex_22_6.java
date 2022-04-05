package ch6;

import java.util.Scanner;

public class Ex_22_6 {
    public static void main(String[] args) {
        double degrees;
        int check;
        Scanner Input = new Scanner(System.in);


        while (true){
            System.out.println("Select type of degrees.");
            System.out.println("Enter 1 for FARENHEIT or 2 for CELSIUS");
            check = Input.nextInt();
            if(check >= 1 && check <= 2)
                break;
        }

        switch (check) {
            case 1: {
                System.out.println("Enter value in FARENHEIT degrees");
                degrees = Input.nextDouble();
                System.out.println("Converted to CELSIUS: " + celsius(degrees));
                break;
            }

            case 2: {
                System.out.println("Enter value in CELSIUS degrees");
                degrees = Input.nextDouble();
                System.out.println("Converted to FARENHEIT: " + farenheit(degrees));
                break;
            }
        }
    }

    public static double celsius (double degrees) {
        return 5.0 / 9.0 * (degrees - 32);
    }

    public static double farenheit(double degrees) {
        return 9.0 / 5.0 * (degrees + 32);
    }
}
