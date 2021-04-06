package day15.demo09;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 练习一
 * 从键盘输入俩个整数a,b，求俩个数的和、差、积、商
 * 并尝试使用try...catch处理可能发生的异常
 */

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            //快捷键：Alt + Ctrl + T
            try {
                System.out.println("请输入一个整数");
                int a = sc.nextInt();
                System.out.println("请输入另一个整数");
                int b = sc.nextInt();

                System.out.println("和："+(a+b));
                System.out.println("差："+(a-b));
                System.out.println("积："+(a*b));
                System.out.println("商："+(a/b));
                break;
            } catch (InputMismatchException e) {
                System.err.println("输入错误,应该输入整数");
                String str =sc.nextLine();//读取当前行内容，我没有接受，就表示丢弃了。
                System.out.println(str);
                break;
            }catch (ArithmeticException e){
                System.err.println("除数不能为零");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        sc.close();//资源关闭
    }
}
