package day15.demo03;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)//限制在@Column的使用位置在属性上
@Retention(RetentionPolicy.RUNTIME)//指定生命周期在运行时

public @interface Column {
    String name();
    String type();
}
