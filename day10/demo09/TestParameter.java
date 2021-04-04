package day10.demo09;

public class TestParameter {
    public static void check(Animal animal){
        animal.eat();
    }
    public static void main(String[] args) {
        check(new Dog());//隐含了，形参Animal animal = 实参 new Dog();
        check(new Cat());//隐含了，形参Animal animal = 实参 new Cat();
        Dog d = new Dog();
        check(d);
    }
}
class Animal{
    public void eat(){
        System.out.println("吃东西");
    }
}
class Dog extends  Animal{
    public void eat(){
        System.out.println("啃骨头");
    }
}
class Cat extends Animal{
    public void eat(){
        System.out.println("吃鱼");
    }
}