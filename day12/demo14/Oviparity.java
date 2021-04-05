package day12.demo14;

public class Oviparity extends Animal{
    @Override
    public void giveBirthTo(){
        System.out.println("卵生");
    }

    public Oviparity(String name) {
        super(name);
    }

    public Oviparity() {
    }
}
