package day10.demo14;

import java.util.Scanner;


public class TextExer {
    public static void main(String[] args) {
        Employee[] all = new Employee[3];

        all[0] = new SalaryEmployee("王常杰", new MyDate(2000, 4, 25), 12000, 22, 2);
        all[1] = new HourEmployee("王伦", new MyDate(2000, 3, 12), 3000, 40, 50);
        all[2] = new SalaryEmployee("王", new MyDate(2000, 4, 9), 10000, 20, 4);

        double sum = 0;
        for (int i = 0; i < all.length; i++) {
            System.out.println("实发工资" + all[i].earning());
            sum += all[i].earning();
        }
        System.out.println("总额" + sum);


        Scanner sc = new Scanner(System.in);
        System.out.println("输入月份");
        int month = sc.nextInt();
        for (int i = 0; i < all.length; i++) {
            if (all[i] instanceof SalaryEmployee) {
                if (all[i].getBirthday().getMonth() == month) {
                    System.out.println("实发工资" + (all[i].earning() + 100));
                    continue;//跳出当前循环，进行下次循环（break,跳出循环）
                }
            }
            System.out.println("实发工资" + all[i].earning());
        }
    }
}
