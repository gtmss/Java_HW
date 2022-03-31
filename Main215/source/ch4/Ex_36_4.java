package ch4;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Ex_36_4 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        int a, b, c;

        while(true){
            System.out.println("Enter lenght of margin A");
            a = Input.nextInt();
            System.out.println("Enter lenght of margin B");
            b = Input.nextInt();
            System.out.println("Enter lenght of margin C");
            c = Input.nextInt();

            if(a > 0 && b > 0 && c > 0){
                break;
            } else System.out.println("Please, enter only positive values");
        }

        if(pow(a, 2) + pow(b, 2) == pow(c, 2) || pow(a, 2) + pow(c, 2) == pow(b, 2) || pow(b, 2) + pow(c, 2) == pow(a, 2) ){
            System.out.println("This is a right triangle");
        } else  System.out.println("This is not a right triangle");

    }
}
