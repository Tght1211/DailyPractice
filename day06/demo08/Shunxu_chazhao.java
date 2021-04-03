package day06.demo08;

import java.util.Scanner;

public class Shunxu_chazhao {
    public static void main(String[] args) {
        BB x = new BB();
        x.chaxun();
    }
}

class BB {
    public void chaxun() {
        int[] arr = {5, 6, 4, 7, 8, 1, 0, 45, 15, 10};
        System.out.println("请输入你要查找的数");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println(value + "不存在");
        } else {
            System.out.println(value + "存在且下标为" + index);
        }
    }
}