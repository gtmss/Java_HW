package ch5;

public class Ex_12_5 {
    public static void main(String[] args) {
        int product = 1;
        int check = 0;

        for (int i = 1; i <= 15; i+=2) {
            System.out.println(i);
            product *= i;
        }
        System.out.println("\nThe product of odd numbers till 15 is: " +product);
    }
}
