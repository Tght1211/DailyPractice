package day07.demo04;

public class Puke {
    public static void main(String[] args) {
        //定义二维数组的行数
        String [][] arr = new String[2][];
       //确定第一行列数，保存花色
        arr[0] = new String[4];//第一行有4列
        //确定第二行列数，第二行存储点数
        arr[1] = new String[13];
        //把花色和点数放进去
        //花色
        arr[0][0] = "黑桃";
        arr[0][1] = "红桃";
        arr[0][2] = "梅花";
        arr[0][3] = "方块";
        //点数
        arr[1][0] = "A";
        for (int i = 1; i <= 9; i++) {
            arr[1][i] = (i + 1)+"";//int 转 字符串类型 int + " "
        }
        arr[1][10] = "J";
        arr[1][11] = "Q";
        arr[1][12] = "K";
        //显示结果
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                //arr[0][i]是花色
                //arr[1][j是点数
                System.out.print(arr[0][i]+"    "+arr[1][j]+"      ");
            }
            System.out.println();
        }
        System.out.println("===============================");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
     }
}
