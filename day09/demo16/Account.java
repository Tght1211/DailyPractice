package day09.demo16;

public class Account {
    private String id;
    private double balance;
    private double annualInterestRate;

    public Account(String id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }


    //月利率方法
    public double getMonthlyInterest() {
        return annualInterestRate / 12;
    }

    //取款方法
    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("非法参数");
            return;//结束方法
        }
        if (amount > balance) {
            System.out.println("余额不足");
        } else {
            balance -= amount;
        }
    }

    //存款方法
    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("非法参数");
            return;//结束方法
        }

        balance += amount;

    }
}
