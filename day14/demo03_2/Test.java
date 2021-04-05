package day14.demo03_2;


public class Test {
    public static void main(String[] args) {
        Worker w = new Worker();
        Apple a1 = new Apple(5, "青色");
        Apple a2 = new Apple(3, "红色");

      //  CompareBig cb = new CompareBig();
        w.pickApple(new CompareAble() {
            //默认方法不要重写
        }, a1, a2);

        System.out.println("===========");

      //  CompareColor cc = new CompareColor();
        w.pickApple(new CompareAble() {
            @Override
            public void compare(Apple a1, Apple a2) {
                if ("红色".equals(a1.getColor())){
                    System.out.println(a1);
                }
                if ("红色".equals(a2.getColor())){
                    System.out.println(a2);
                }
            }
        }, a1, a2);
    }
}
