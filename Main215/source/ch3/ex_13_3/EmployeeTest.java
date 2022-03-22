package ch3.ex_13_3;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee user1 = new Employee("Mihai", "Speianu", 1700);
        Employee user2 = new Employee("Alexandru", "Diaconescu", 2200);

        displayYearlySalary(user1);
        displayYearlySalary(user2);

        user1.setMonthlySalary(user1.getMonthlySalary() * 1.1);
        displayYearlySalary(user1);
        user2.setMonthlySalary(user2.getMonthlySalary() * 1.1);
        displayYearlySalary(user2);

    }

    public static void displayYearlySalary(Employee user){
        System.out.print("\n******************\n");
        System.out.println("Employee STATUS\n___________________");
        System.out.printf("Frst Name: %s\n", user.getFirstName());
        System.out.printf("Last Name: %s\n", user.getLastName());
        System.out.printf("Yearly salary: %.2f\n", 12 * user.getMonthlySalary());
    }
}
