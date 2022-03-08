import java.util.Scanner;

public class Ex_25_2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num = Input.nextInt();

        if ((num % 2) == 0 ) {
            System.out.println("Number is even");
        } else System.out.println("Number is odd");
    }
}
