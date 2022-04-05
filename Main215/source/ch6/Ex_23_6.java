package ch6;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Ex_23_6 {
    public static void main(String[] args) {
        double number1, number2, number3;
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter 3 number to compare");
        number1 = Input.nextDouble();
        number2 = Input.nextDouble();
        number3 = Input.nextDouble();
        System.out.println("Minimum is: "+minimum3(number1, number2, number3));
    }

    public static double minimum3 (double num1, double num2, double num3){
        num1 =  Math.min(num1, num2);
        return Math.min(num1, num3);
    }
}
