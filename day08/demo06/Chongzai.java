package day08.demo06;

//方法的重载：
//在同一个内中，出现了俩个或多个的方法名相同，形参列表不同，称为方法重载。
//形参列表不同：形参个数、数据类型不同
//方法的重载和返回值类型无关
//方法重载不看返回值类型是否一致，只看方法名和形参列表
public class Chongzai {
    public static void main(String[] args) {
        System.out.println(max(1,14));
        System.out.println(max(1.0,2.9));
        System.out.println(max(2,5,7));
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static double max(double a, double b) {
        return a > b ? a : b;
    }
    public  static int max(int a,int b,int c){
        int max = a > b ? a : b;
        max = max >c ? max : c;
        return  max;
    }
}
