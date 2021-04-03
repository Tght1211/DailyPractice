package day05.demo06;

public class Printing {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if((i) == j || (i) == 8- j){
                    System.out.print("O");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }
}
