package day05.demo08;

public class Array {
    public static void main(String[] args) {
        char [] Array_A = new char[26];//动态初始化数组
        char [] Array_B = new char[Array_A.length];
        for (int i = 0; i < Array_A.length; i++) {
            Array_A[i] = (char)('A'+i);
        }
        for (int i = 0; i < Array_B.length; i++) {
            Array_B[i] = Array_A[Array_A.length - 1 -i];
        }

        //显示结果
        for (int i = 0; i < Array_B.length; i++) {
            System.out.print(Array_B[i]);
        }
    }
}
