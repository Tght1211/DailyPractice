package day05.demo07;

public class demo07 {
    public static void main(String[] args) {
        //规定5行
        for (int i = 1; i <= 5; i++) {
            for (int k = 4; k >= i ; k--) {
                System.out.print("     ");//5
            }
            for (int j = 1; j<= 2 * i - 1; j++) {
                System.out.print("*   ");//5
            }
            System.out.println();
        }
        //下半部分
        for (int i = 1; i <= 4; i++) {
            for (int k = 1; k <= i ; k++) {
                System.out.print("     ");//5
            }
            for (int j = 1;j<= 9-2*i ; j++) {
                System.out.print("*   ");//5
            }
            System.out.println();
        }
    }
}



