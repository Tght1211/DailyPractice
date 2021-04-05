package day13.demo15;

import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Object object1 = new Object() {
            public void test() {
                System.out.println("n匿名内部类1");
            }
        };
        System.out.println(object1.getClass());//获取对象的运行时类型
        System.out.println(object1);

        //声明了匿名内部类，创建了它的对象，且说明它调用了.test()
        new Object() {
            public void test() {
                System.out.println("hello匿名内部类");
            }
        }.test();

        //用接口创建的匿名实现类对象
        //赋值给了Comparator的一个变量
        Comparator c =  new Comparator(){
            @Override
            public int compare(Object o1, Object t1) {
                Circle c1 = (Circle) o1;
                Circle c2 = (Circle) t1;
                if (c1.getRadius() > c2.getRadius()) {
                    return 1;
                } else if (c1.getRadius() < c2.getRadius()) {
                    return -1;
                }
                return 0;
            }
        };

        System.out.println(c.compare(new Circle(2),new Circle(4)));
}

/*
class RadiusCircle implements Comparator {
    @Override
    public int compare(Object o1, Object t1) {
        Circle c1 = (Circle) o1;
        Circle c2 = (Circle) t1;
        if (c1.getRadius() > c2.getRadius()) {
            return 1;
        } else if (c1.getRadius() < c2.getRadius()) {
            return -1;
        }
        return 0;
    }
*/

}


class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle   [radius = " + radius + "]";
    }
}
