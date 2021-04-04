package day09.demo02;

public class MyArrays {
    //int binarySearch(int [] arr,int value)
    //用二分法查出value的下标
    //如果value不存在返回-1，如果数组不是有序的结果将不一定正确
    public int binarySearch(int[] arr, int value) {
        int left = 0;
        int right = arr.length - 1;
        int index = -1;
        int mid = (left + right) / 2;
        while (left <= right) {//满足条件一定会被找到下标
            if (arr[mid] == value) {
                return mid;//下标
            } else if (value > arr[mid]) {
                left = mid + 1;
            } else if (value < arr[mid]) {
                right = mid - 1;
            }
            mid = (left + right)/2;
        }//否则返回-1；
        return  -1;
    }
    /**
     * int[] copy(int [] arr,int length):从指定的arr数组的arr[0]开始复制到一个新数组新数组的长度为length。
    */
    public int[] copy(int []arr, int length){
        //1.创建新数组
        int [] newArr = new int [length];
        //2.复制元素
        for (int i = 0; i < arr.length && i <newArr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
    /**
     * void sort(int [] arr):可给arr数组从小到大排序，用冒泡排序实现
     */
    public void sort(int [] arr){
        for (int i = 1; i < arr.length; i++) {//int i = 1，因为比的次数要少于长度一次，每次默认第一个最大（最小）
            for (int j = 0; j < arr.length - i; j++) {//从第一个开始遍历，arr.length-i遍历剩下的部分。
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    //打印方法
    public void Info(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
