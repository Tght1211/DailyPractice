package day16.team_manager.bean;

public class PC implements Equipment {
    private String model;
    private String display;

    public PC() {
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    @Override
    public String toString() {
        return getDescription();
    }
    @Override
    public String getDescription(){
        return model + '\''+ "(" + display + ")";
    }
}
