package day12.demo14;

public class Viviparity extends Animal {
    @Override
    public void giveBirthTo() {
        System.out.println("胎生");
    }

    public Viviparity(String name) {
        super(name);
    }

    public Viviparity() {
    }
}
