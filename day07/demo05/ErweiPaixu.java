package day07.demo05;

import java.util.Scanner;

public class ErweiPaixu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //键盘输入一共有几组，确定二维数组的行数
        System.out.print("输入一共有几组：");
        int group = input.nextInt();
        //创建二维数组确定行数
        int[][] arr = new int[group][];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("请输入第" + (i + 1) + "组的人数：");
            arr[i] = new int[input.nextInt()];
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("第" + (j + 1) + "位组员的成绩:");
                arr[i][j] = input.nextInt();
            }
        }
        //显示成绩表
        System.out.println("=======================座次排序=======================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("第" + (i + 1) + "组\t" + ":\t");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        //每一组的最高分、最低分、平均分
        int[] group_max = new int[group];
        int[] group_min = new int[group];
        int [] group_avg = new int[group];
        int max = -1;//全班最高分
        int min = 101;//全班最高分,假设成绩的范围是[0-100]
        int sum = 0;
        int count = 0;
        //把每一组最高分、最低分都化为初始化特殊值
        for (int i = 0; i < group; i++) {
            group_max[i] = -1;
            group_min[i] = 101;
        }
        //统计
        for (int i = 0; i < arr.length; i++) {
            int group_Sum = 0;//每一组的总分，每一组的总分从0开始加
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > group_max[i]) {
                    group_max[i] = arr[i][j];
                }
                if (arr[i][j] < group_min[i]) {
                    group_min[i] = arr[i][j];
                }
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
                group_Sum += arr[i][j];//当前组的总分
                sum += arr[i][j];//班级总分
                count++;
            }
            group_avg[i] = group_Sum / arr[i].length;
        }
        //全班的平均分
        int avg = sum / count;

        //对每一组进行冒泡排序
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i-1].length - i; j++) {
                if (arr[i-1][j] < arr[i-1][j + 1]) {//降序
                    int temp = arr[i-1][j + 1];
                    arr[i-1][j + 1] = arr[i-1][j];
                    arr[i-1][j] = temp;
                }
            }
        }
        //显示结果
        System.out.println("=======================成绩降序=======================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("第" + (i + 1) + "组\t");
            System.out.print( "\t平均分为:\t" + group_avg[i]+ "\t最高分为：\t" + group_max[i] + "\t最低分为：\t" + group_min[i]+"\t成绩：\t");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("=======================班级成绩=======================");
        System.out.println("全班最高分为：" + max);
        System.out.println("全班最低分为：" + min);
        System.out.println("全班平均分为：" + avg);
        System.out.println("全班总人数为：" + count);
    }
}
