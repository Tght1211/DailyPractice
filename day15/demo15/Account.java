package day15.demo15;

import javax.security.auth.login.AccountException;
import java.nio.channels.AcceptPendingException;

public class Account {
    private int id;// 账号
    private double balance;//余额
    private double annualInterestRate;//年利率

    public Account() {
        super();
    }

    public Account(int id, double balance, double annualInterestRate) {
        super();
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    //返回月利率的方法
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }

    //返回月利息
    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }
//取款方法
    public void withdraw(double money)  throws AccountException{
        if (money < 0){
            throw new AccountException("取款金额有误");
        }
        if (money > balance){
            throw new AccountException("余额不足");
        }
        balance -= money;
    }
    //存款方法
    public void deposit(double money) throws AccountException{
        if (money < 0){
            throw new AccountException("存款金额有误");
        }
        balance += money;
    }
}
