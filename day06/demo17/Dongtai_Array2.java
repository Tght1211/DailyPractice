package day06.demo17;

public class Dongtai_Array2 {
    public static void main(String[] args) {
        int[][] arr = new int[5][];//动态初始化二维数组
        for (int i = 0; i < arr.length; i++) {//分配每一行的列数
            arr[i] = new int[i + 1];
        }
        //确定每一行元素的值
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + 1;
            }
        }
        //遍历二维数组显示结果
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}

/*结果显示
1
2  2
3  3  3
4  4  4  4
5  5  5  5  5
 */
