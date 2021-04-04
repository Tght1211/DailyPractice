package day10.demo14;

public class SalaryEmployee extends Employee{
     private int WorkDay;
     private int SunDay;

    @Override
    public double earning() {
        return super.earning() - super.earning()/getWorkDay() * getSunDay();
    }

    public SalaryEmployee() {
        super();
    }

    public SalaryEmployee(String name, MyDate birthday, double salary, int workDay, int sunDay) {
        super(name, birthday, salary);
        WorkDay = workDay;
        SunDay = sunDay;
    }

    public int getWorkDay() {
        return WorkDay;
    }

    public void setWorkDay(int workDay) {
        WorkDay = workDay;
    }

    public int getSunDay() {
        return SunDay;
    }

    public void setSunDay(int sunDay) {
        SunDay = sunDay;
    }
}
