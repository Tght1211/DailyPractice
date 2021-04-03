package day06.demo11;

//直接选择排序
public class Zhijiexuanzhe {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 9, 7, 3, 4, 6, 8};//arr.length = 9
        for (int i = 0; i < arr.length - 1; i++) {//总共8轮
            int min = arr[i];//假定第一个为小值
            int index = i;//最小值的小标
            for (int j = i + 1; j < arr.length; j++) {//在第i轮的情况下从下标为1的数字开始遍历
                if (arr[j] < min) {//用后面的数字对比之前假定的最小值
                    min = arr[j];
                    index = j;
                }
            }
            if (index != i) {//发现比假定最小值还小的数字就进行交换
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
        //显示遍历结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
