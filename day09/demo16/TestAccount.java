package day09.demo16;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account("11223344",20000,4.5/100);
        account.withdraw(30000);
        System.out.println("余额："+account.getBalance());
        account.withdraw(2500);
        System.out.println("余额："+account.getBalance());
        account.deposit(3000);
        System.out.println("余额："+account.getBalance());
        System.out.println("月利率："+account.getMonthlyInterest()*100+"%");
    }
}

