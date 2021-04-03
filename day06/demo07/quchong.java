package day06.demo07;

//元素去重
public class quchong {
    public static void main(String[] args) {
        int[] arr = {9, 10, 6, 6, 1, 9, 3, 5, 6, 4,4};
        int count = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < count; j++) {
                if (arr[i] == arr[j]) {

                    for (int k = j; k < count - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    count--;
                }
            }
        }

        //创建新数组
        int[] newArr = new int[count];
        //复制元素
        for (int i = 0; i < count; i++) {
            newArr[i] = arr[i];
        }
        //显示结果
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");

        }
    }
}
