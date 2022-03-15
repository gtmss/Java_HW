package ch2;

import java.util.Scanner;

public class Ex_33_2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Introduce your parameters");
        System.out.println("Weight in Kilograms: ");
        float weightInKilograms = Input.nextFloat();
        System.out.println("Height in Meters: ");
        float heightInMeters = Input.nextFloat();
        float BMI = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.println("BMI VALUES");
        if (BMI < 18.5) {
            System.out.println("Underweight");
        } else if ((BMI > 18.5) && (BMI < 24.9)) {
            System.out.println("Normal");
        } else if ((BMI > 25) && (BMI < 29.9)) {
            System.out.println("Overweight");
        } else if (BMI >= 30) {
            System.out.println("Obese");
        }
    }
}
