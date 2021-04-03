package day02.demo20;

public class Test19_Exer {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int z = 9;
        int max = x >= y ? x : y;
        max = max >= z ? max :z;
        System.out.println("最大值是："+max);
    }
}
