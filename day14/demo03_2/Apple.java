package day14.demo03_2;

public class Apple {
    private int size;
    private String color;

    public Apple() {
        super();
    }

    public Apple(int size, String color) {
        super();
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return    size +"-"+  color ;
    }
}
