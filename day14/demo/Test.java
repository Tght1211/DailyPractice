package day14.demo;

import day14.demo.Person.Huo;
//子类构造器的首行为什么一定要调用父类的构造器
public class Test {
    public static void main(String[] args) {
        Man m = new Man(new Person());
        m.test();
        System.out.println("============");
        Person p2 = new Person();
        System.out.println("============");

    }
}


class Person{
    public  Person(){
        System.out.println("父类无参构造");
    }

    abstract class Huo{
         public abstract void test();
    }

}

class Man extends Huo {

    public Man(Person p){
        p.super();
    }

    @Override
    public void test(){
        System.out.println("重写的test");
    }
}