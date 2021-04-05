package day13.demo16;

public class Test {
    public static void main(String[] args) {

        /*new Father(){
          @Override
          public void method(){
              System.out.println("hello 孩子");
          }
        }.method();*/

        Father f = new Father() {
            @Override
            public void method() {
                System.out.println("hello 孩子");
            }
        };
        f.method();

    }
}


abstract class Father{
    public abstract void method();
}