package day16.team_manager.bean;

public class Architect extends Designer {
    private int stock;

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        //  getMemberId() + "/" + getBasicInfo() +"\t架构师\t" + getBonus() + "\t" + stock
        return getBasicInfo() + "\t\t架构师\t\t" + getStatus() + "\t" + getBonus() + "\t"+stock+"\t"+getEquipment() ;
    }

    public String getMemberInfo(){
        return "\t"+getMemberId() + "\t/\t" + getBasicInfo() + "\t\t架构师\t\t" + getBonus() + "\t\t" + stock;
    }
}
