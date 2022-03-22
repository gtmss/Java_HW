package ch3.Ex_13_3;

public class Employee {
    private String FirstName;
    private String LastName;
    private double MonthlySalary;

    public Employee(String FirstName, String LastName, double MonthlySalary){
        this.FirstName = FirstName;
        this.LastName = LastName;
        if (MonthlySalary > 0){
            this.MonthlySalary = MonthlySalary;
        }
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public double getMonthlySalary() {
        return MonthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            MonthlySalary = monthlySalary;
        }
    }

}
