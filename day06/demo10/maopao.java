package day06.demo10;

//冒泡排序
public class maopao {
    public static void main(String[] args) {
        int [] arr = {1,2,5,9,7,3,4,6,8};
        for (int i = 1; i < arr.length; i++) {//循环次数=长度-1次

            for(int j = 0; j < arr.length-i ; j++){//在每次的循环中，每比较一个少一次，在这里最多比较7次，然后开始第二轮
                if(arr[j] > arr[j+1]){//升序
                    int temp = arr[j];//拿个空瓶子转换一下值
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //遍历显示
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
