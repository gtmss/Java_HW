package ch3.Ex_16_3;

public class HeartRatesTest {
    public static void main(String[] args)
    {
        HeartRates person = new HeartRates("Ion","Gatman",10,9,2001);
        System.out.println("RESULTS\n________________");
        System.out.println(person.age());
        System.out.println(person.maxHeartRate());
        System.out.println(person.targetHeartRate());
    }
}
