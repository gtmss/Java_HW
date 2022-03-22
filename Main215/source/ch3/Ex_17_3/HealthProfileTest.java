package ch3.Ex_17_3;

public class HealthProfileTest {
    public static void main(String[] args) {

        HealthProfile person = new HealthProfile("max", "red", "Masculine", 1, 1, 1921, 1.67, 60);

        System.out.println("Age : " + person.age());
        System.out.println("BMI : " + person.bmi());
        System.out.println("Max heart rate : " + person.maxHeartRate());
        System.out.println("Target reart rate range : " + person.targetHeartRate());

    }
}
