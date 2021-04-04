package day10.demo11;

public class TestExer2 {
    public static void goToToilet(Person person){//形参是Person类型的
        person.toilet();
    }
    public static void main(String[] args) {
        goToToilet(new Woman());
        goToToilet(new Man());
    }
}

class Person{
    public void toilet(){
        System.out.println("上厕所");
    }
}

class Woman extends Person{
    @Override
    public void toilet() {
        System.out.println("蹲着上厕所");
    }
}

class Man extends Person{
    @Override
    public void toilet() {
        System.out.println("站着上厕所");
    }
}