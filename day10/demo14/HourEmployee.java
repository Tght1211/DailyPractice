package day10.demo14;

public class HourEmployee extends Employee{
    private int hours;
    private double money;

    public HourEmployee() {
        super();
    }

    public HourEmployee(String name, MyDate birthday, double salary, int hours, double money) {
        super(name, birthday, salary);
        this.hours = hours;
        this.money = money;
    }

    @Override
    public double earning() {
        return getSalary() +getHours() * getMoney();
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
