package ch4;

import javax.swing.*;
import java.awt.event.WindowStateListener;
import java.util.Scanner;

public class Ex_30_4 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        int num;
        int clone;
        int counter = 0;
        int mie = 10000;

        while (true) {
            System.out.println("Eneter a 5 digit integer number");
            num = Input.nextInt();

            if((num / 10000 >= 1 && (num / 10000 <= 9.9999))){
                break;
            }
        }
        clone = num;

        while (num != 0){
            int digit = num / mie;
            System.out.printf("%d ", digit);
            num %= mie;
            mie /= 10;

            int mirror = clone % 10;
            //System.out.println(+mirror);
            clone /= 10;

            if (mirror == digit) {
                counter++;
                //System.out.println(+counter);
            }
        }

        if (counter == 5){
            System.out.println("\nThat's a palidrome");
        } else System.out.println("\nThat's not a palidorme");
    }
}
