package day08.demo13;

public class ObjectArray {
    public static void main(String[] args) {
        //数组的元素类型是Circle
        Circle[] arr = new Circle[5];
        //为元素赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Circle();
            arr[i].radius = i+1;
        }
        //打印每一个元素的信息
        for (int i = 0; i < arr.length; i++) {
            arr[i].printInfo();
        }
    }
}
