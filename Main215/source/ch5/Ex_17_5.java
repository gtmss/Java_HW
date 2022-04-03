package ch5;

import java.util.Scanner;

public class Ex_17_5 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        /*final double product1 = 2.98;
        final double product2 = 4.50;
        final double product3 = 9.98;
        final double product4 = 4.49;
        final double product5 = 6.87;*/
        double product1 = 0;
        double product2 = 0;
        double product3 = 0;
        double product4 = 0;
        double product5 = 0;
        String check;

        System.out.println("Do you want to add some new data ? press yES or nO");
        check = Input.next();

        while (!check.equals("n")){
            int code;
            while (true) {
                System.out.println("Enter the product code");
                code = Input.nextInt();
                if (code > 0 && code <= 5) {
                    break;
                } else System.out.println("Introduce a number between 1 and 5");
            }

            int quantity;
            while (true){
                quantity = Input.nextInt();
                System.out.println("Enter quantity");
                if (quantity > 0){
                    break;
                } else System.out.println("Quantity can't be negative");
            }


            switch (code){
                case 1:
                    product1 = product1 + 2.98 * quantity;
                    break;
                case 2:
                    product2 = product2 + 4.50 * quantity;
                    break;
                case 3:
                    product3 = product3 + 9.98 * quantity;
                    break;
                case 4:
                    product4 = product4 + 4.49 * quantity;
                    break;
                case 5:
                    product5 = product5 + 6.87 * quantity;
                    break;
            }

            System.out.println("Do you want to add some new data ? press yES or nO");
            check = Input.next();
        }
        System.out.printf("Total retail value of all products sold: %.2f", product1 + product2 + product3 +product4 + product5);
    }
}
