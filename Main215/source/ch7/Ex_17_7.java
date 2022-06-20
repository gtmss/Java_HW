package ch7;

import java.security.SecureRandom;

public class Ex_17_7 {
    public static final int DICE_VALUE = 6;
    //random numbers generator
    public static final SecureRandom randomNumbers = new SecureRandom();

    public static void main(String[] args) {
        int[] results = new int[11];

        for (int i = 0; i < 36000000; i++) {

            switch (shake()) {
                case 2: {
                    results[0] += 1;
                    break;
                }
                case 3: {
                    results[1] += 1;
                    break;
                }
                case 4: {
                    results[2] += 1;
                    break;
                }
                case 5: {
                    results[3] += 1;
                    break;
                }
                case 6: {
                    results[4] += 1;
                    break;
                }
                case 7: {
                    results[5] += 1;
                    break;
                }
                case 8: {
                    results[6] += 1;
                    break;
                }
                case 9: {
                    results[7] += 1;
                    break;
                }
                case 10: {
                    results[8] += 1;
                    break;
                }
                case 11: {
                    results[9] += 1;
                    break;
                }
                case 12: {
                    results[10] += 1;
                    break;
                }
            }
        }

        display(results);
    }

    public static int shake() {
        int dice1 = randomNumbers.nextInt(DICE_VALUE) + 1;
        int dice2 = randomNumbers.nextInt(DICE_VALUE) + 1;
        int totalValue = dice1 + dice2;

        return totalValue;
    }

    public static void display(int[]    results){
        System.out.println("_____________________________________________________________________________________");

        for (int i = 2; i < 13; i++) {
            System.out.println("     " +i +"    |");

        }

        System.out.println();
        System.out.println("_____________________________________________________________________________________");
        System.out.println();

        for (int i = 0; i < 11; i++) {
            System.out.print("  " +results[i] +"|");
        }

        System.out.println();
        System.out.println("_____________________________________________________________________________________");

    }

}




