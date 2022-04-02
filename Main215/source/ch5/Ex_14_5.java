package ch5;

public class Ex_14_5 {
    public static void main(String[] args) {
        double amount; // amount on deposit at end of each year
        double principal = 1000.0; // initial amount before interest
        double rate = 0.05; // interest rate

        // display headers
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        // calculate amount on deposit for each of ten years
        // calculations are repeted for 6 different rates
        for (int i = 0; i < 6; i++) {
            System.out.printf("\n\nCalculated for %.0f%% rate\n________________________________\n",rate * 100);
            for (int year = 1; year <= 10; year++) {
                // calculate new amount for specified year
                amount = principal * Math.pow(1.0 + rate, year);

                // display the year and the amount
                System.out.printf("%4d%,20.2f%n", year, amount);

            }
            rate += 0.01;
        }
    }
}
