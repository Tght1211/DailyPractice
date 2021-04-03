package day05.demo05;

import java.util.Scanner;

public class Day04_Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("年：");
        int year = sc.nextInt();

        System.out.println("月：");
        int month = sc.nextInt();

        System.out.println("日：");
        int day = sc.nextInt();

        int days = day;
//累加month（1，month-1）的天数
        for (int i = 1; i < month; i++) {
            if (i == 4 || i == 6 || i == 9 || i == 11) {
                days += 30;
            } else if (i == 2) {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ){
                    days += 29;
                }else{
                    days += 28;
                }
            }else {
                days += 31;
            }
        }

        //2000 ， year - 1 的满年天数
        for (int i = 2000; i < year; i++) {
            if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0){
                days += 366;
            }else{
                days += 365;
            }
        }

        if(days%5 == 1 || days%5 == 2 || days%5 == 3 ){
            System.out.println("打鱼");
        }else{
            System.out.println("晒网");
        }
        System.out.println("距离2000年一月一日已有"+days+"天");
    }
}





