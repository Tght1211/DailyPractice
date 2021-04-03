package day07.demo12;

public class Juxing {
    public static void main(String[] args) {
        Cfx x = new Cfx();
        x.a = 10;
        x.b = 8;
        System.out.println("长方形的面积为"+(x.a*x.b));
    }
}

class Cfx{
    int a ;//长
    int b;//宽
}