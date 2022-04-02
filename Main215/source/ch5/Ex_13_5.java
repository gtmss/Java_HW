package ch5;

public class Ex_13_5 {
    public static void main(String[] args) {
        long factorial = 1;

        for (int i = 1; i <= 20 ; i++) {
            factorial *= i;
        }

        System.out.println("20! = " +factorial);
    }
}
