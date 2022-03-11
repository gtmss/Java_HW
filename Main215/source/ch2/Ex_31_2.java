package ch2;

import static java.lang.Math.pow;

public class Ex_31_2 {
    public static void main(String[] args) {

        System.out.printf("number\tsquare\tcube\n");

        for (int count = 0; count < 11; count++) {
            int square = count * count;
            int cube = square * count;
            System.out.printf("%d\t\t%d\t\t%d\n", count, square , cube);
        }
    }
}
