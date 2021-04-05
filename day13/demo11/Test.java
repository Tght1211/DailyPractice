package day13.demo11;

import day05.demo08.Array;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Employee [] arr = new Employee[3];
        arr[0] = new Employee(22,"王小名",2,20000);
        arr[1] = new Employee(21,"王小后",1,10000);
        arr[2] = new Employee(19,"王小组",3,15000);

        //排序
        Arrays.sort(arr);
        //遍历结果
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("=============================================");

        Arrays.sort(arr,new SalaryComparator());//(对象数组，对象);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
