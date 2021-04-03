package day07.demo03;

public class Yanghui {
    public static void main(String[] args) {
        //确定行数为10行
        int[][] yanghui = new int[10][];
        //确定列数
        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i] = new int[i + 1];
        }
        //为元素赋值
        //(1)给第一行第一个元素赋值
        yanghui[0][0] = 1;
        //(2)给列的第一个元素和最后一个元素赋值
        for (int i = 1; i < yanghui.length; i++) {
            yanghui[i][0] = 1;
            yanghui[i][i] = 1;
        }
        //(3)核心算法赋值
        for (int i = 2; i < yanghui.length; i++) {
            for (int j = 1; j < yanghui[i].length - 1; j++) {
                yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
            }
        }
        //显示结果遍历二维数组
        for (int i = 0; i < yanghui.length; i++) {
            for (int j = 0; j < yanghui[i].length; j++) {
                System.out.print(yanghui[i][j]+"      ");
            }
            System.out.println();
        }
    }
}
