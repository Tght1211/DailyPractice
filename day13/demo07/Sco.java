package day13.demo07;

import java.util.Comparator;

public class Sco implements Comparator {

    @Override
    public int compare(Object o, Object t1) {
        Student s = (Student) o;
        Student s2 = (Student) t1;
        if (s.getAge() > s2.getAge()){
            return 1;
        }else if (s.getAge() < s2.getAge()){
            return -1;
        }
        return 0;
    }

}
