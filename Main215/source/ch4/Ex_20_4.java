package ch4;

import java.util.Scanner;

public class Ex_20_4 {
    public static void main(String[] args) {
        double employee;
        double numberOfHours;
        double hourlyRate;

        Scanner Input = new Scanner(System.in);
        //emp1
        for (int i = 0; i < 3; i++) {
            System.out.printf("\nIntroduce the number of working hours for employee %d\n", i);
            numberOfHours = Input.nextDouble();
            System.out.printf("Introduce the HOURLY RATE for employee %d\n", i);
            hourlyRate = Input.nextDouble();

            if (numberOfHours > 40 && numberOfHours > 0 && hourlyRate > 0){
                employee = numberOfHours * (hourlyRate * 1.5);
                System.out.printf("Employee gross pay: %.2f\n", employee);

            } else if (numberOfHours > 0 && numberOfHours < 40 && hourlyRate > 0) {
                employee = numberOfHours * hourlyRate;
                System.out.printf("Employee gross pay: %.2f\n", employee);

            } else {
                System.out.println("Number of hours must be positive");
                System.out.println("Hourly rate should be positive");
                i--;
            }

            employee = 0;

        }
    }
}
