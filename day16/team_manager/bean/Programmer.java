package day16.team_manager.bean;

public class Programmer extends Employee {
    private int memberId;
    private Status status = Status.FREE;//员工状态
    private Equipment equipment;//设备（接口）

    //无参构造
    public Programmer() {
    }
//有参构造
    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public Programmer(int id, String name, int age, double salary, int memberId, Status status, Equipment equipment) {
        super(id, name, age, salary);
        this.memberId = memberId;
        this.status = status;
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        if (super.getId() == 10){
            return getBasicInfo()+ "\t\t\t程序员\t\t" + status + "\t\t\t\t" + "\t\t\t\t" + equipment;
        }
        return getBasicInfo()+ "\t\t程序员\t\t" + status + "\t\t\t\t"+ "\t\t\t\t"  + equipment;
    }

    public String getMemberInfo(){
        return "\t"+memberId + "\t/\t" + getBasicInfo() + "\t\t程序员\t\t";
    }
/*    public enum Status {
        BUSY,FREE,VOCATION//忙的，空闲的，假期的
    }*/
}

