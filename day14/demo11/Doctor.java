package day14.demo11;

public class Doctor {
    public void swapHeart(Body b1, Body b2) {
        //交换心脏
        Organ temp = b1.getHeart();
        b1.setHeart(b2.getHeart());
        b2.setHeart(temp);

        //交换健康
        boolean H_temp = b1.isHealth();
        b1.setHealth(b1.isHealth());
        b1.setHealth(H_temp);
    }
}

