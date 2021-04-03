package day07.demo09;

public class Test01 {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "张三";
        p.age = 24;
        p.gender = '男';
        System.out.println(p.name+p.age+p.gender);
    }
}

class Person{
    String name;
    int age;
    char gender;
}
