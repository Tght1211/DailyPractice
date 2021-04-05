package day14.demo11;

import java.util.Random;

public class Body {
    private String owner;
    private double weight;
    private boolean health;
    private Organ heart;


    public Body(String owner, double weight, boolean health) {
        super();
        this.owner = owner;
        this.weight = weight;
        this.health = health;
        Heart heart = new Heart();

        heart.size = weight * 0.005;
        Random random = new Random();
        if (health) {
            heart.color = "鲜红色";
            //random.nextInt(10) == >[0,10)
            heart.beatPerMinute = random.nextInt(41) + 60;//[60,101)
        } else {
            heart.color = "暗红色";
            heart.beatPerMinute = random.nextInt(60);
        }

        this.heart = heart;
    }

    public Body() {
        super();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isHealth() {
        return health;
    }

    public void setHealth(boolean health) {
        this.health = health;
    }

    public Organ getHeart() {
        return heart;
    }

    public void setHeart(Organ heart) {
        this.heart = heart;
    }

    @Override
    public String toString() {
        return "Body{" +
                "owner='" + owner + '\'' +
                ", weight=" + weight +
                ", health=" + health +
                ", heart=" + heart +
                '}';
    }

    private class Heart extends Organ {

        int beatPerMinute;
        String color;
        double size;

        public int getBeatPerMinute() {
            return beatPerMinute;
        }

        public void setBeatPerMinute(int beatPerMinute) {
            this.beatPerMinute = beatPerMinute;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double getSize() {
            return size;
        }

        public void setSize(double size) {
            this.size = size;
        }

        @Override
        public void doWork() {
            System.out.println("心率："+beatPerMinute + "，大小：" + size +"克"+"，颜色："+color);
            System.out.println("为血液流动提供动力，把血液运行至"+Body.this.owner+"身体各个部分");
        }

        @Override
        public String toString() {
            return "Heart{" +
                    "beatPerMinute=" + beatPerMinute +
                    ", color='" + color + '\'' +
                    ", size=" + size +
                    '}';
        }
    }
}
