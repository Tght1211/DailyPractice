package day15.demo10;

public class Test02 {
    {
        System.out.println("b");//类初始化：main所在的类要先初始化，才能执行main方法。
    }                                         //由（1）静态比哪里的显示赋值，（这里没有）（2）静态代码块
    static {
        System.out.println("a");
    }
    Test02(){                         //实例初始化：必须要new对象才会有，这里没有创建Test02的对象，所以不出来
        System.out.println("c");
    }
    public static String getOut(){
        try{
            return "1";
        }catch (Exception e){
            return "2";
        }finally {
            return "3";//finally中有return就从finally的return回去了
        }
    }

    public static void main(String[] args) {
        System.out.println(getOut());//3
    }
}

/*
 * 结果：
 * a
 * 3
 */
