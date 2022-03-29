package ch4;

public class Ex_22_4 {
    public static void main(String[] args) {
        System.out.printf("N\t10*N\t100*N\t1000*N\n\n");

        for (int i = 1; i < 6; i++) {
            System.out.printf("%d\t%d\t\t%d\t\t%d\n",i, 10 * i, 100 * i, 1000 * i);
        }
    }
}
