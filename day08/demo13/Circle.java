package day08.demo13;

public class Circle {
    double radius;
    double getArea(){
        return 3.14 * radius *radius;
    }
    void printInfo(){
        System.out.println("半径："+radius+"，面积："+getArea());
    }
}
