package day08.demo04;

public class Chuang {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        swap(x, y);

    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("x = " + a + "\ny = " + b);
    }
}
