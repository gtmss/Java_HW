package ch3.Ex_16_3;

import java.util.Calendar;

public class HeartRates {
    String firstName;
    String lastName;
    int month;
    int day;
    int year;

    public HeartRates(String firstName, String lastName, int month, int day, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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
}
