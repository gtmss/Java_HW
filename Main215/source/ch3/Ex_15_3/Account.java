package ch3.Ex_15_3;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance)
    {
        this.name = name;
        if (balance > 0.0)
            this.balance = balance;
    }

    public void deposit(double depositAmount){
        if (depositAmount > 0.0)
        {
            balance += depositAmount;
        }
    }

    public double getBalance()
    {
        return balance;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void withdraw(double sum)
    {
        if (sum>balance)
        {
            System.out.println("Withdrawal amount exceeded account balance");
        }
        else
        {
            balance = balance - sum;
        }
    }
}
