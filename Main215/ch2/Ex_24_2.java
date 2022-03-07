import java.util.Scanner;

public class Ex_24_2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;

        System.out.println("Introduce num1: ");
        num1 = Input.nextInt();
        System.out.println("Introduce num2: ");
        num2 = Input.nextInt();
        System.out.println("Introduce num3: ");
        num3 = Input.nextInt();
        System.out.println("Introduce num4: ");
        num4 = Input.nextInt();
        System.out.println("Introduce num5: ");
        num5 = Input.nextInt();
        //gratest
        if ((num1 > num2) && (num1 > num3) && (num1 > num4)&& (num1 > num5)){
            System.out.printf("%d is larger", num1);
        } else if ((num2 > num1) && (num2 > num3) && (num2 > num4)&& (num2 > num5)){
            System.out.printf("%d is larger", num2);
        } else if ((num3 > num1) && (num3 > num2) && (num3 > num4)&& (num3 > num5)){
            System.out.printf("%d is larger", num3);
        } else if ((num4 > num1) && (num4 > num3) && (num4 > num2)&& (num4 > num5)){
            System.out.printf("%d is larger", num4);
        } else if ((num5 > num1) && (num5 > num3) && (num5 > num4)&& (num5 > num2)){
            System.out.printf("%d is larger", num5);
        } else System.out.println("Numbers are equal");
        //smaler
        if ((num1 < num2) && (num1 < num3) && (num1 < num4)&& (num1 < num5)){
            System.out.printf("%d is smaler", num1);
        } else if ((num2 < num1) && (num2 < num3) && (num2 < num4)&& (num2 < num5)){
            System.out.printf("%d is smaler", num2);
        } else if ((num3 < num1) && (num3 < num2) && (num3 < num4)&& (num3 < num5)){
            System.out.printf("%d is smaler", num3);
        } else if ((num4 < num1) && (num4 < num3) && (num4 < num2)&& (num4 < num5)){
            System.out.printf("%d is smaler", num4);
        } else if ((num5 < num1) && (num5 < num3) && (num5 < num4)&& (num5 < num2)){
            System.out.printf("%d is smaler", num5);
        } else System.out.println("Numbers are equal");
    }

}
