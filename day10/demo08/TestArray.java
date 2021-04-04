package day10.demo08;

/*
*多态应用：
 * （1）多态数组
 * 数组的元素是父类类型，实际存储的是子类对象
 * 用这样的数组就可以统一管理，所有的子类对象
*/

public class TestArray {
    public static void main(String[] args) {
        Graphic [] all = new Graphic[3];
        all[0] = new Circle(1.2);
        Graphic g2 = new Rectangle(2, 4);
        all[1] = g2;
        all[2] = new Circle(4.2);
        for (int i = 0; i < all.length; i++) {
            System.out.println("面积："+all[i].getArea());
        }
    }
}
class Graphic{
    public double getArea(){
        return 0.0;//这句话无意义，只是为了保证语法
    }
}
class Circle extends Graphic{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return 3.14 * radius *radius;
    }
}

class Rectangle extends Graphic{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea(){
        return length * width;
    }
}
