package ch3.Ex_17_3;

import java.util.Calendar;

public class HealthProfile {
    String firstName;
    String lastName;
    String gender;
    int day;
    int month;
    int year;
    double height;
    double weight;

    public HealthProfile(String firstName, String lastName, String gender, int day, int month, int year, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.day = day;
        this.month = month;
        this.year = year;
        this.height = height;
        this.weight = weight;
    }


    public int age()
    {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH);
        if (currentMonth>month)
        {
            return currentYear - year;
        }
        else
        {
            return currentYear - year - 1;
        }
    }

    public int maxHeartRate()
    {
        return 220 - age();
    }

    public double targetHeartRate()
    {
        return 0.6 * maxHeartRate();
    }

    public String bmi()
    {
        double bmi = weight / (height*height);
        if (bmi<18.5)
        {
            return "Underweight";
        }
        else if ((bmi>=18.5) && (bmi<=24.9))
        {
            return "Normal";
        }
        else if ((bmi>=25) && (bmi<29.9))
        {
            return "Overweight";
        }
        else
        {
            return "Obese";
        }
    }
}
