package day13.demo07;

public class Test {
    public static void main(String[] args) {
        Student St1 = new Student(22,"玩啊");
        Student St2 = new Student(21,"多行");

        Sco a1 = new Sco();
        if(a1.compare(St1,St2) > 0){
            System.out.println("St1的年龄 > St2的年龄");
        }
        else if(a1.compare(St1,St2) < 0){
            System.out.println("St1的年龄 < St2的年龄");
        }
        else {
            System.out.println("St1的年龄 = St2的年龄");
        }
    }
}
