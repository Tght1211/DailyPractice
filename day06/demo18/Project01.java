package day06.demo18;

//Scanner版键盘接收
import java.util.Scanner;

public class Project01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        int balance = 10000;//基本金
        String details = "收支\t收支金额\t账户金额\t说    明\n";
        while (flag) {
            System.out.println("--------------------家庭收账记账软件--------------------");
            System.out.println("\t\t1.收支明细");
            System.out.println("\t\t2.登记收入");
            System.out.println("\t\t3.登记支出");
            System.out.println("\t\t4.退       出");


            System.out.println("请选择1—4:");//接受用户的选择
            //Utility.readMenuSelection();
            int select = input.nextInt();
            switch (select) {
                case 1:
                    System.out.println(details);
                    break;
                case 2:
                    System.out.println("本次收入金额: ");
                    int money = input.nextInt();

                    System.out.println("本次收入说明: ");
                    String info = input.next();

                    balance += money;
                    details += "支出\t\t" + money + "\t\t" + balance + "\t\t" + info + "\n";
                    break;

                case 3:
                    System.out.println("本次支出金额: ");
                    money = input.nextInt();

                    System.out.println("本次支出说明: ");
                    info = input.next();

                    balance -= money;
                    details += "支出\t\t" + money + "\t\t" + balance + "\t\t" + info + "\n";
                    break;
                case 4:
                    System.out.println("确认是否退出(Y/N):    ");
                    char confirm = input.next().charAt(0);
                    if(confirm == 'Y'||confirm == 'y'){
                        flag = false;
                    }
            }
        }
    }
}
