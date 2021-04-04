package day10.demo07;

public class TestPolymorphism {
    public static void main(String[] args) {
        //1.本态引用
        Person p = new Person();
        Woman w = new Woman();
        Man m = new Man();
        //2.多态引用
        Person p2 = new Woman();//把Women对象向上转型为Person类型，就只能调用Person类的方法
        p2.eat();
        p2.walk();



        //向下转型
//        Woman woman = p;//编译时报错
        Woman woman = (Woman) p2;
        woman.shop();


        Person p3 = new Woman();
        if (p3 instanceof Woman){
            Woman wo = (Woman) p3;
            wo.shop();
        }else if(p3 instanceof Man)
        {
            Man ma = (Man)p3;
            ma.smoke();
        }

       // Person p3 = new Man();

        p2.eat();
        p2.walk();
        //p2.shop();
    }
}

class Person {
    public void eat() {
        System.out.println("吃饭");
    }

    public void walk() {
        System.out.println("走路");
    }
}

class Woman extends Person {
    public void eat() {
        System.out.println("细嚼慢咽");
    }

    @Override
    public void walk() {
        System.out.println("慢慢走路");
    }

    public void shop() {
        System.out.println("疯狂购买");
    }
}

class Man extends Person {
    @Override
    public void walk() {
        System.out.println("急速狂奔");
    }

    @Override
    public void eat() {
        System.out.println("狼吞虎咽");
    }

    public void smoke() {
        System.out.println("吸烟");
    }
}