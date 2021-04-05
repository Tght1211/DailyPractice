package day12.demo14;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void giveBirthTo();
}



