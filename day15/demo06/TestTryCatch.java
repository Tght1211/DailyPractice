package day15.demo06;

public class TestTryCatch {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int shang = a/b;
            System.out.println(a + "/"+ b + "=" + shang );
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("其他代码");
    }
}
