package day07.demo02;
/*
从键盘输入本组学员人数，和本组学员成绩，然后实现从高到低排序
 */
import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //（1）确定人数，即确定数组长度
        System.out.println("请输入本组学员人数：");
        int count = sc.nextInt();
        //（2）创建数组
        int [] score = new int[count];
        //（3）输入学员的成绩
        for (int i = 0; i < score.length; i++) {
            System.out.println("请输入第"+(i+1)+"个学员的成绩：");
            score[i] = sc.nextInt();
        }
        //（4）排序，冒泡排序（从大到小
        for (int i = 1; i < score.length; i++) {
            for (int j = 0; j < score.length - i; j++) {
                if(score[j] < score[j + 1]){//实现从高到低排序
                    int temp = score[j+1];
                    score[j+1] = score[j];
                    score[j] = temp;
                }
            }
        }
        //（5）显示结果
        System.out.println("学员成绩排列如下");
        for (int i = 0; i < score.length; i++) {
            System.out.print(score[i]+"     ");
        }
    }
}
