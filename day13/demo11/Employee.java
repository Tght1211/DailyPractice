package day13.demo11;

import java.util.Comparator;

public class Employee implements Comparable {
     int age;
    private String name;
    private int id;
    private double salary;

    public Employee() {
        super();
    }

    public Employee(int age, String name, int id, double salary) {
        super();
        this.age = age;
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return " Employee [id = "+ id + ", name = "+ name +",age = "+ age + ", salary = " + salary + "]";
    }

    //按照编号从小到大排序
    //Comparable接口重写compareTo方法。
    //实现sort();排序
    @Override
    public int compareTo(Object o){
        return this.id -((Employee)o).id;//向下转型为Employee类型。
    }
}
