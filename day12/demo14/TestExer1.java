package day12.demo14;

public class TestExer1 {
    public static void main(String[] args) {
        Animal[] all = new Animal[2];
        all[0] = new Oviparity("翠鸟");
        all[1] = new Viviparity("京巴狗");

        for (int i = 0; i < all.length; i++) {
            System.out.print(all[i].getName()+"   :  ");
            all[i].giveBirthTo();
        }
    }
}

