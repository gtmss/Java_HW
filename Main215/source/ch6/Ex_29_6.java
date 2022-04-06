package ch6;

import java.security.SecureRandom;
import java.util.Scanner;

public class Ex_29_6 {
    public enum COIN{
        HEADS,
        TAILS
    }

    public static void main(String[] args) {
        SecureRandom random1 = new SecureRandom();
        Scanner Input = new Scanner(System.in);
        int headsCount = 0;
        int tailsCount = 0;
        int rand;
        int check;
        COIN coin;

        while (true) {
            System.out.println("Do you want to toss coin ?");
            System.out.println("**********************");
            System.out.println("______YES_____NO______");
            System.out.println("*******1******2*******");
            check = Input.nextInt();
            if (check == 2)
                break;

            rand = random1.nextInt(1,3);
            coin = toss(rand);
            System.out.println("Random number = "+rand+" face coin = "+coin);
            if(coin == COIN.HEADS){
                headsCount++;
            }else if(coin == COIN.TAILS){
                tailsCount++;
            }
        }

        System.out.println("_________RESULTS_________");
        System.out.println("HEADS appeared " +headsCount +" times");
        System.out.println("TAILS appeared " +tailsCount +" times");
    }

    public static COIN toss(int faceCoin) {
        COIN copy = null;
        switch (faceCoin){

            case 1:{
                copy = COIN.HEADS;
                break;
            }
            case 2:{
                copy = COIN.TAILS;
            }
        }
        return copy;
    }
}
