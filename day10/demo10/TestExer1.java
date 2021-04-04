package day10.demo10;

public class TestExer1 {
    public static void main(String[] args) {
        Traffic [] all = new Traffic[5];
        all[0] = new Car();
        all[1] = new Bicycle();
        all[2] = new Car();
        all[3] = new Bicycle();
        all[4] = new Car();
        for (int i = 0; i < all.length; i++) {
            all[i].drive();
        } 
    }
}
class Traffic{
    public void drive(){
        System.out.println("冲呀");
    }
}

class Car extends  Traffic{
    @Override
    public void drive() {
        System.out.println("好快");
    }
}

class Bicycle extends Traffic{
    @Override
    public void drive() {
        System.out.println("慢慢的~");
    }
}