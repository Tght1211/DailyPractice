package day06.demo12;
//二维数组遍历
public class Erwei_Array {
    public static void main(String[] args) {
         int [] [] arr = {{1},{2,2},{3,3,3},{4,4,4,4},{5,5,5,5,5}};//静态初始化二维数组
        for (int i = 0; i < arr.length; i++) {//行遍历
            for (int j = 0; j < arr[i].length; j++) {//列遍历
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();//行输出后的换行
        }
    }
}
