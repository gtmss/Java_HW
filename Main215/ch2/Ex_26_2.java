import java.util.Scanner;

public class Ex_26_2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        int num1 = Input.nextInt();
        int num2 = Input.nextInt();

        if ((num1 % num2) == 0) {
            System.out.printf("%d is multiple of %d", num1, num2);
        }
    }
}
