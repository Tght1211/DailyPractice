package day16.demo04;

public class Test {
    @org.junit.Test
    public void test1() {
        //装箱操作（把基本数据类型装箱成包装类）
        int a = 10;//a是基本数据类型
        Integer aObj = new Integer(a);//把a中的数据包装成一个对象
        System.out.println(a);
        System.out.println(aObj);//自动调用toString(),Integer重写了Object的toString，打印的是包装的值。
        System.out.println(aObj.getClass());//打印运行时类型
        System.out.println(aObj.hashCode());
    }

    //自动装箱
    @org.junit.Test
    public void test2() {
        int a = 10;//a是基本数据类型
        Integer aObj2 = a;//左边是包装类型右边是int类型。
        System.out.println(aObj2.getClass());//打印运行时类型
    }

    @org.junit.Test
    public void test3() {
        int a = 10;
//        Double d = a;//报错！ Double不是int的包装类。
//        Double d = 10;//同样。
        Double d = 10.0;//才对，Double包装类只能与double类型的数据自动装与拆。
    }

    @org.junit.Test
    public void test4() {
        Integer i = new Integer(10);
        int a = i.intValue();//手动拆箱（调用方法环境）
        int b = i;//自动拆箱
    }

    @org.junit.Test
    public void test5() {
        Integer i = new Integer(1);
        int j = 1;
        double w = 1.0;
        //结果：true
        System.out.println(i == j);//(1)先把i拆箱为int值，(2)然后int与int比较。
        System.out.println(w == j);//(1)先把i拆箱为int值，(2)然后把i自动类型转换为double(3)然后double与double比较。
    }

    @org.junit.Test
    public void test06() {
        int a = Integer.parseInt("123");//把字符串类型的123转为int类型。
        System.out.println(a);

        // int b  = Integer.parseInt("123.05");
        // System.out.println(b);//错误，NumberFormatException
        double b = Double.parseDouble("123.05");
        System.out.println(b);
    }

    @org.junit.Test
    public void test07() {
        int num = Integer.valueOf("123");//这里有俩步（1）先有右边转为Integer对象。（2）再自动拆箱为int。
        double d = Double.valueOf("123.4");//步骤和上面一样的
    }

    @org.junit.Test
    public void test08() {
        System.out.println(Integer.toBinaryString(10));//二进制
        System.out.println(Integer.toOctalString(10));//八进制
        System.out.println(Integer.toHexString(10));//十六进制
    }

    @org.junit.Test
    public void test09() {
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }

    @org.junit.Test
    public void test10() {
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('B'));
    }

    @org.junit.Test
    public void test11() {
        Integer a = 1;//值是指向常量池里的地址值
        Integer b = 1;
        System.out.println(a == b);//true a == b 比较的也是地址值，（a和b指向的是同一个缓存的常量对象）

        Integer c = 130;//缓存对象 -128 ~ 127
        Integer d = 130;//超过127，变不用缓存对象，而是去堆中新建Integer对象。
        System.out.println(c == d);//false c == d比较的是地址值， （c和d都是在堆种新建的Integer对象，对象地址自然不一样。）
    }

    @org.junit.Test
    public void test12() {
        Integer a = 1;
        Double b = 1.0;
//        System.out.println(a == b);//无法比较，因为对象比较地址，必须是同一类型或有父子关系
        long c = 1L;
        System.out.println(a == c);//因为c是基本数据类型，a就会自动拆箱，再基本数据类型的值进行比较
    }

    @org.junit.Test
    public void test13() {
        Double a = 1.0;//自动装箱
        Double b = 1.0;
        //Byte，Short，Integer，Long：都有缓存对象 -128 ~ 127。（Double没有）
        System.out.println(a == b);//false.这里是堆里new的对象地址比较。
    }

    @org.junit.Test
    public void test14(){
        Character c1 = '0';
        Character c2 = '0';
        System.out.println(c1 == c2);//true,比的是ASCCII码值
        Character c3 = '尚';
        Character c4 = '尚';
        System.out.println(c3 == c4);//false
        
    }
}

