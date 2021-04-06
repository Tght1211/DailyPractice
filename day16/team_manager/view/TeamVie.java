package day16.team_manager.view;

import day16.team_manager.bean.Employee;
import day16.team_manager.bean.Programmer;
import day16.team_manager.exception.TeamException;
import day16.team_manager.service.NameListService;
import day16.team_manager.service.TeamService;
import day16.team_manager.utils.TSUtility;

public class TeamVie {

    //根据编号获取员工对象
    private NameListService ns = new NameListService();
    //添加到团队里
    private TeamService ts = new TeamService();

    public void menu(){

            System.out.println("--------------------------------------------开发团队调度软件--------------------------------------------");
            getAllEmployee();

        while (true){
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            System.out.print("1-团队列表    2-添加团队成员    3-删除团队成员    4-退出 请选择（1 - 4）:");
            char select = TSUtility.readMenuSelection();
            switch (select){
                case '1':
                    list();
                    break;
                case '2':
                    getAllEmployee();
                    add();
                    break;
                case '3':
                    list();
                    remove();
                    break;
                case '4':
                    System.out.println("确认是否退出（Y/N）:");
                    char confirm = TSUtility.readConfirmSelection();
                    if (confirm == 'Y' || confirm == 'y'){
                        return;
                    }
            }
        }
    }

    private void list(){
        System.out.println("------------------------------团队成员列表------------------------------");
        System.out.println("T_ID/ID\t\t\t姓名\t\t\t年龄\t\t工资\t\t\t\t职位\t\t\t奖金\t\t\t\t股票");
        Programmer [] allMembers= ts.getAllMembers();
        for (int i = 0; i < allMembers.length; i++) {
            System.out.println(allMembers[i].getMemberInfo());//不调用toString()
        }
        System.out.println("---------------------------------------------------------------------------");
//        TSUtility.readReturn();
    }
    private void add(){
        System.out.println("---------------------------------添加成员---------------------------------");
        //输入编号
        System.out.println("请输入要添加的员工ID：");
        int id  = TSUtility.readInt();
/*        //根据编号获取员工对象
        NameListService ns = new NameListService();*/
        try {
            Employee emp = ns.getEmployeeById(id);
            /*
            //添加到团队里
            TeamService ts = new TeamService();*/
            ts.addMember(emp);

            System.out.println("添加成功");
        } catch (TeamException e) {
            System.out.println("添加失败，原因："+e.getMessage());
        }
        TSUtility.readReturn();//相当于暂停一下，按下回车后继续
/*        System.out.println("--------------------------------------------开发团队调度软件--------------------------------------------");
        getAllEmployee();*/
    }

    private  void remove(){
        System.out.println("---------------------------------删除成员---------------------------------");
        System.out.print("请输入要删除员工的T_ID：");
        int tid = TSUtility.readInt();
        //确认是否删除
        System.out.println("确认是否删除（Y/N）");
        char confirm =  TSUtility.readConfirmSelection();//Y
        if (confirm == 'N'){
            System.out.println("删除取消！");
            return;//提前结束删除
        }
        try {
            //删除，调用TeaService的removeMemberByTid删除

            ts.removeMemberByTid(tid);
            System.out.println("删除成功");
        } catch (TeamException e) {
            System.out.println("删除失败，原因："+e.getMessage());
        }
        TSUtility.readReturn();
    }

    private void getAllEmployee(){
        System.out.println("ID\t\t姓名\t\t\t年龄\t\t工资\t\t\t\t职位\t\t\t状态\t\t奖金\t\t\t股票\t\t领用设备");
//        NameListService us = new NameListService();
        Employee [] all = ns.getAll();

        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }
    }
}
