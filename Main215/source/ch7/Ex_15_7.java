package ch7;

import java.util.Scanner;

public class Ex_15_7
{
    public static void main(String[] args)
    {
        int arrLength;

        Scanner Input =  new Scanner(System.in);
        System.out.println("How long should be array ?");


        if (args.length != 1){
            System.out.println("By default, array length is 10");
            arrLength = 10;
            sumator(arrLength);
        } else {
            arrLength = Integer.parseInt(args[0]);
            sumator(arrLength);
        }

    }

    public static void sumator(int arrLength){
        int[] array = new int[arrLength]; // new creates the array object

        System.out.printf("%s%8s%n", "Index", "Value"); // column headings

        // output each array element's value
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);
    }
}


