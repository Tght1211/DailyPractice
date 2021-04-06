package day15.demo06;

import day15.demo15.Account;

import javax.security.auth.login.AccountException;

public class Test {
    public static void main(String[] args) throws AccountException {
        Account a1 = new Account(1122,20000,4.5/100);

        try {
            //取款
            a1.withdraw(3000);
            System.out.println("取款成功 : 余额，"+a1.getBalance());
        } catch (AccountException e) {
            System.out.println("取款失败，原因"+e.getMessage());
        }

        try {
            //取款
            a1.withdraw(2500);
            System.out.println("取款成功 : 余额，"+a1.getBalance());
        } catch (AccountException e) {
            System.out.println("取款失败，原因"+e.getMessage());
        }

        try {
            //存款
            a1.deposit(3000);
            System.out.println("存款成功 : 余额，"+a1.getBalance());
            System.out.println("月利率 : "+a1.getMonthlyInterestRate()  * 100 + "%");
            System.out.println("年利息 : "+a1.getBalance() * a1.getAnnualInterestRate()+"元");
        } catch (AccountException e) {
            System.out.println("存款失败，原因"+e.getMessage());
        }

    }
}
