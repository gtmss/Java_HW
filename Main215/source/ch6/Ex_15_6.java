package ch6;

import java.util.Scanner;

import static java.lang.Math.*;

public class Ex_15_6 {
    public static void main(String[] args) {
        double side1, side2;
        Scanner Input = new Scanner(System.in);

        while (true){
            System.out.println("Enter lengh of side 1 of a triangle");
            side1 = Input.nextDouble();
            System.out.println("Enter lengh of side 2 of a triangle");
            side2 = Input.nextDouble();

            if (side1 > 0 && side2 > 0) {
                break;
            } else System.out.println("Both values should be positive");
        }

        System.out.printf("Hypotenuse of a right triangle with sides %.2f and %.2f" +
                " = %.2f", side1, side2, hypotenuse(side1, side2));

    }

    public static double hypotenuse(double side1, double side2) {
        return sqrt(pow(side1, 2) + pow(side2, 2));
    }
}
