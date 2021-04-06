package day15.demo03;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)//限定@Table的使用位置为类上
@Retention(RetentionPolicy.RUNTIME)//指定生命周期为运行时
public @interface Table {
    //String 类型的配置参数value
    String value();

}
