package day14.demo13;

public class Test {
    public static void main(String[] args) {
        Season s = Season.Spring;
        System.out.println(s);
        System.out.println(s.name());
        System.out.println(s.ordinal());
        System.out.println("=======================");
        Season [] all = Season.values();
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }
        System.out.println("===============");
        Season spring  =Season.valueOf("Spring");
        System.out.println(spring);
    }
}


enum Season{
    Spring("春暖花开"),Summer,Fall,Winter;

    private String description;

    private Season() {
    }

    private Season(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return name() + ":" + description ;
    }
}