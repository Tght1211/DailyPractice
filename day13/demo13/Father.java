package day13.demo13;

public class Father {
    public void test(){
        System.out.println("fff");
    }
}

interface D{
    public default void test(){
        System.out.println("ddd");
    }
}

class Son extends Father implements D{
    //选择一：默认选择，保留父类(super.test();)
    //选择二：改选，保留干爹的（接口）(D.super.test();)
   /* @Override
    public void test() {
       D.super.test();
    }*/
   //选择三： 完全自己重写
    @Override
    public void test() {
        System.out.println("sss");
    }
}