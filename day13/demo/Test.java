package day13.demo;

import day13.demo07.Student;

public class Test {
    public static void main(String[] args) {
        Course stu1 = new Course(99, 77, 45);

        if (stu1.compareTo(stu1) > 0) {
            System.out.println("java");
        } else if (stu1.compareTo(stu1) < 0) {
            System.out.println("平");
        }
        else {
            System.out.println("和平均相等");
        }

    }
}


class Course implements Comparable {
    private double java;
    private double math;
    private double English;


    public Course() {
        super();
    }

    public Course(double java, double math, double english) {
        this.java = java;
        this.math = math;
        English = english;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getEnglish() {
        return English;
    }

    public void setEnglish(double english) {
        English = english;
    }

    public Double Average() {
        return (this.English + this.java + this.math) / 3;
    }


    @Override
    public int compareTo(Object o) {
        Course course = (Course) o;
        if (this.Average() > course.getJava()) {
            return -1;
        } else if (this.Average() < course.getJava()) {
            return 1;
        }
        return 0;
    }
}