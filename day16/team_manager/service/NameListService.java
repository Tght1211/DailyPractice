package day16.team_manager.service;

import day16.team_manager.bean.*;
import day16.team_manager.exception.TeamException;

import static day16.team_manager.utils.Data.*;//就可以直接调用Data里的static。(静态导入)

public class NameListService {
    private Employee [] all;//用来存储全公司的员工对象。

    public NameListService(){
        init();
    }
    //初始all数据的方法，数据来源是Data.java
    private void init(){
        //（1）创建all数组，并且指定长度
        all = new Employee[EMPLOYEES.length];
        //（2）遍历Data中的EMPLOYEES的二维数组，把一行一行的数据
        //封装为一个一个的Employee,Programmer等的对象，放到all的数组当中
        for (int i = 0; i < EMPLOYEES.length; i++) {
            //员工的类型：EMPLOYEES[i][0]
            int empType = Integer.parseInt(EMPLOYEES[i][0]);
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);


            switch (empType){
                case EMPLOYEE :
//                    all[i] = 创建Employee对象
                    all[i] = new Employee(id,name,age,salary);
                    break;
                case PROGRAMMER:
//                    all[i] = 创建Programmer对象
                    all[i] = new Programmer(id, name, age, salary, getEquipmentByLineNumber(i));
                    break;
                case DESIGNER:
//                    all[i] = 创建Designer对象
                    double bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    all[i] = new Designer(id,name,age,salary,getEquipmentByLineNumber(i),bonus);
                    break;
                case ARCHITECT:
//                    all[i] = 创建Architect对象
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    int stock = Integer.parseInt(EMPLOYEES[i][6]);
                    all[i] = new Architect(id,name,age,salary,getEquipmentByLineNumber(i),bonus,stock);
                    break;
            }
        }
    }

    private Equipment getEquipmentByLineNumber(int i){
        int eType = Integer.parseInt(EQIPMENTS[i][0]);
        switch (eType){
            case PC:
                return new PC(EQIPMENTS[i][1],EQIPMENTS[i][2]);
            case NOTEBOOK:
                return new NoteBook(EQIPMENTS[i][1],Double.parseDouble(EQIPMENTS[i][2]));
            case PRINTER:
                return new Printer(EQIPMENTS[i][1],EQIPMENTS[i][2]);
        }
        return null;
    }

    public Employee [] getAll(){
        return all;
    }

    //根据员工编号，获取员工对象
    public Employee getEmployeeById(int id) throws TeamException{
        for (int i = 0; i < all.length; i++) {
            if (all[i] .getId() == id){
                return all[i];
            }
        }
        throw new TeamException(id + "该员工不存在");
    }

}
