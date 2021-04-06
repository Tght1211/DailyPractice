package day16.team_manager.bean;

public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;

    //有/无参构造方法，getter，setter，toString
    public Employee() {
    }

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getBasicInfo();
    }

    protected String getBasicInfo() {
        if (id < 10){
            return id +"\t\t\t" + name  + "\t\t" + age + "\t\t" + salary;
        }
        else if (id == 10){
            return id +"\t\t" + name  + "\t\t" + age + "\t\t" + salary;
        }
        else if (id == 11){
            return id +"\t\t\t" + name  + "\t\t" + age + "\t\t" + salary;
        }
        return id +"\t\t" + name  + "\t\t" + age + "\t\t" + salary;
    }
}
