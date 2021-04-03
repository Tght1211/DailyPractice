package day06.demo09;

import java.util.Scanner;

//二分查找
public class erfen_chazhao {
    public static void main(String[] args) {
        int [] arr = {1,3,4,6,8,9};
        System.out.println("请输入你要查找的数");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int index = -1;
        int left = 0 ;
        int right = arr.length - 1;
        int mid  = (left + right)/2;
        while(left <= right){
            if(arr[mid] == value){
                index = mid;
                break;
            }else if (value > arr[mid]){//去右边找
                left = mid + 1;//3
            }else {
                right = mid - 1;
            }
            mid = (left + right)/2;
        }
        if (index == -1) {
            System.out.println(value + "不存在");
        } else {
            System.out.println(value + "存在且下标为" + index);
        }
    }
}
