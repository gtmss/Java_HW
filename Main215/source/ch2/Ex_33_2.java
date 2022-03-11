package ch2;

import java.util.Scanner;

public class Ex_33_2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        double weightInKilograms;
        double heightInMeters;

        System.out.println("Introduce your parameters");
        System.out.println("Weight in Kilograms: ");
        weightInKilograms = (float) Input.nextDouble();
        System.out.println("Height in Meters: ");
        heightInMeters = (float) Input.nextDouble();
        double BMI = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.println("BMI VALUES");
        if (BMI < 18.5) {
            System.out.println("Underweight: less than 18.5");
        } else if ((BMI > 18.5) && (BMI < 24.9)) {
            System.out.println("Normal: between 18.5 and 24.9");
        } else if ((BMI > 25) && (BMI < 29.9)) {
            System.out.println("Overweight: between 25 and 29.9");
        } else if (BMI >= 30) {
            System.out.println("Obese: more than 30");
        }
    }
}
