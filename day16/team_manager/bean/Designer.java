package day16.team_manager.bean;

public class Designer extends Programmer {
    private double bonus;

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return  getBasicInfo() + "\t\t设计师\t\t" + getStatus() + "\t" + bonus + "\t\t\t\t" +getEquipment() ;
    }

    public String getMemberInfo(){
        return "\t"+getMemberId() + "\t/\t" + getBasicInfo() + "\t\t设计师\t\t" + bonus;
    }
}
