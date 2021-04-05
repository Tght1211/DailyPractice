package day13.demo11;

import java.util.Comparator;

public class SalaryComparator implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        Employee e1 = (Employee)o;
        Employee e2 = (Employee)t1;
        if (e1.getSalary() > e2.getSalary()){
            return 1;
        }
        else if(e1.getSalary() < e2.getSalary()){
            return -1;
        }
        return 0;
    }

}
