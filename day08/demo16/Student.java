package day08.demo16;

public class Student {
    private  String name;
    private int age;
    private double score;
    //提供公共的get/set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    //提供getInfo()方法
    //注意！并不是打印
    public String getInfo(){
        return "姓名："+name+",年龄"+age+",成绩"+score;
    }
}
