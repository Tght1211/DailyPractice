package day14.demo03;

public interface CompareAble {
    public default void compare(Apple a1, Apple a2){
        if (a1.getSize() > a2.getSize()){
            System.out.println(a1);
        }else if (a1.getSize() < a2.getSize()){
            System.out.println(a2);
        }
    }
}
