package ch2;

import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Ex_28_2 {
    public static void main(String[] args) {
        System.out.println("Introduce the radius of a circle:");
        Scanner Input = new Scanner(System.in);

        int radius = Input.nextInt();
        /*
        double diameter = 2 * radius;
        double circumference = 2 * PI * radius;
        double area = PI * pow(radius, 2); */

        System.out.printf("Radius: %d\n", radius);
        System.out.printf("Diameter: %d\n", 2 * radius);
        System.out.printf("Cricumference: %f\n", 2 * PI * radius);
        System.out.printf("Area: %f\n", PI * pow(radius, 2));
    }
}
