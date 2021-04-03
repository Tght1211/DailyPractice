package day08.demo14;

import java.util.Scanner;

public class TeatStudentArray {
    public static void main(String[] args) {
        Student [] all = new Student[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < all.length; i++){
            System.out.println("请输入第"+(i + 1)+"个学员的信息：");
            //创建这个学生对象
            all[i] = new Student();
            System.out.print("姓名：");
            all[i].name = sc.next();
            System.out.print("成绩：");
            all[i].score = sc.nextInt();
        }
        //遍历学生信息
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i].getInfo());
        }
        System.out.println("==============冒泡排序===================");
        for (int i = 1; i < all.length; i++) {//控制轮数！注意！i的初值为1！
            for (int j = 0; j < all.length - i; j++) {//遍历比较，用第一个为假定最大值比较
                //从低到高，
                if (all[j].score > all[j+1].score){
                    int temp = all[j].score;
                    all[j].score = all[j+1].score;
                    all[j+1].score = temp;
                }
            }
        }
        
        //排序完成
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i].getInfo());
        }
    }
}
