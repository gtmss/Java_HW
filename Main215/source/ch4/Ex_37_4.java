package ch4;

import java.util.Scanner;

public class Ex_37_4 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        int number1, number2, number3;

        while(true){
            System.out.println("Enter a value for number 1");
            number1 = Input.nextInt();
            System.out.println("Enter a value for number 2");
            number2 = Input.nextInt();
            System.out.println("Enter a value for number 2");
            number3 = Input.nextInt();

            if(number1 > 0 && number2 > 0 && number3 > 0){
                break;
            } else System.out.println("Please, enter only positive values");
        }

        //A factorial for 3 values
        System.out.printf("Factorial for first number %d\n", factorial(number1));
        System.out.printf("Factorial for second number %d\n", factorial(number2));
        System.out.printf("Factorial for third number %d\n", factorial(number3));

        //B
        System.out.printf("Constant E aproximated: %f", e_aprox());
    }

    public static double e_aprox(){
        double e = 1;
        for (int i = 1; i < 100; i++) {
            e += 1/factorial(i);
        }
        return e;
    }

    public static long factorial(int n){
        long number = n;
        for (int i = 1; i < n; i++) {
            number *= i;
        }
        return number;
    }
}
