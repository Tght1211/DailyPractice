package day14.demo02;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("选择：");
        String role = sc.next();

        FightAble f = Player.select(role);
        f.specialFight();
        f.commonFight();

        System.out.println("=================");
        System.out.print("选择： ");
        String role2 = sc.next();
        FightAble f2 = Player.select(role2);
        f2.specialFight();
        f2.commonFight();
    }
}

interface FightAble{
    void specialFight();

    public default void commonFight(){
        System.out.println("普通攻击");
    }
}

class Soldier implements FightAble{

    @Override
    public void specialFight() {
        System.out.println("武器攻击");
    }
}

class Master implements FightAble{
    @Override
    public void specialFight() {
        System.out.println("法术攻击");
    }
}


class Player {
    public static FightAble select(String string){
        if ("法力角色".equals(string)){
            return new Master();
        }
        else if ("武力角色".equals(string)){
            return new Soldier();
        }
        return null;
    }
}