package ch6;

import java.util.Scanner;

public class Ex_20_6 {
    public static void main(String[] args) {
        double radius;
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter radius of a circle:");

        while (true){
            radius = Input.nextDouble();
            if (radius > 0) {
                break;
            } else System.out.println("Radius can't be negative");
        }

        System.out.println("Area of this circe is: ");
        System.out.println(+circleArea(radius));
    }

    public static double circleArea (double r){
        return Math.PI * Math.pow(r, 2);
    }
}
