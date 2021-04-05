package day14.demo03;

public class CompareColor implements CompareAble {
    //重写接口中的默认方法，需要删掉default
    public  void compare(Apple a1, Apple a2){
        if ("红色".equals(a1.getColor())){
            System.out.println(a1);
        }
        if ("红色".equals(a2.getColor())){
            System.out.println(a2);
        }
    }
}
