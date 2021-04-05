package day13.demo17;


import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Employee [] all = new Employee[3];
        all[0] = new Employee(1,"张三",10000);
        all[1] = new Employee(2,"李四",30000);
        all[2] = new Employee(3,"王五",20000);

        Arrays.sort(all, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee, Employee t1) {
                Employee e1 = (Employee) employee;
                Employee e2 = (Employee) t1;
                //升序
                //return e1.getId() - e2.getId();
                if (e1.getId() > e2.getId()){
                    return 1;
                }else if(e1.getId() < e2.getId()){
                    return -1;
                }
                return 0;
            }
        });

        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }

        System.out.println();
        System.out.println("=========================================");

        Arrays.sort(all, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee, Employee t1) {
                Employee e3 = (Employee) employee;
                Employee e4 = (Employee) t1;
                return e3.getSalary() - e4.getSalary();
                /*if (e3.getSalary() > e4.getSalary()){
                    return 1;
                }else if(e3.getSalary() < e4.getSalary()){
                    return -1;
                }
                return 0;*/
            }
        });
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }

    }
}

