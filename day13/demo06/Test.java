package day13.demo06;

public class Test {
    public static void main(String[] args) {
        MyRunnable [] arr = new MyRunnable[3];
        arr[0] = new Car();
        arr[1] = new Person();
        arr[2] = new Dog();

        for (int i = 0; i < arr.length; i++) {
            arr[i].run();
        }
    }
}
