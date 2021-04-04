package day09.demo02;

public class Test {
    public static void main(String[] args) {
        MyArrays sc = new MyArrays();
        int[] arr = {4, 6, 7, 3, 8, 1, 4};
        sc.sort(arr);
        sc.Info(arr);

        System.out.println();
        System.out.println("=========================");

        int[] newArr = sc.copy(arr, 3);
        sc.Info(newArr);

        System.out.println();
        System.out.println("=========================");

        int index = sc.binarySearch(arr,8);
        System.out.println("8在数组arr中的下标为"+index);
    }
}
