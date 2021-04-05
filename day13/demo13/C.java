package day13.demo13;

public class C implements A,B{
    public void test(){
        //同时继承来个接口，出现同名的方法，
        // 随便选择一个，抛弃一个
        A.super.test();//保存A接口的实现
    }
}

interface A{
    public default void test(){
        System.out.println("aaa");
    }
}

interface B{
    public default void test(){
        System.out.println("bbb");
    }
}
