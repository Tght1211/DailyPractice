package day14.demo03;

public class Test {
    public static void main(String[] args) {
        Worker w = new Worker();
        Apple a1 = new Apple(5, "青色");
        Apple a2 = new Apple(3, "红色");

        CompareBig cb = new CompareBig();
        w.pickApple(cb, a1, a2);

        System.out.println("===========");

        CompareColor cc = new CompareColor();
        w.pickApple(cc, a1, a2);
    }
}
