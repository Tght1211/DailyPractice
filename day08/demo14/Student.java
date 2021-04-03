package day08.demo14;

public class Student {
//    Scanner sc = new Scanner(System.in);
//    String name = sc.next();
//    int score = sc.nextInt();
    String name;
    int score;
    void printInfo(){
        System.out.println("姓名："+name+"，成绩"+score);
    }
    String getInfo(){
        return "姓名：\t"+name+"\t，成绩"+score;
    }
}
