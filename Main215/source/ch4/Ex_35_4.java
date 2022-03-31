package ch4;

import java.util.Scanner;

public class Ex_35_4 {
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

        if(a + b > c && b + c > a && a + c > b){
            System.out.println("These values are edges of a triangle");
        } else System.out.println("These margins can't forme a triangle");
    }
}
