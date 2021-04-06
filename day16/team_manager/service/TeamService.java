package day16.team_manager.service;

import day16.team_manager.bean.Architect;
import day16.team_manager.bean.Designer;
import day16.team_manager.bean.Employee;
import day16.team_manager.bean.Programmer;
import day16.team_manager.exception.TeamException;
import day16.team_manager.bean.Status;

import java.util.Arrays;

public class TeamService {
    private Programmer[] team;//装开发团队成员
    private int total;//实际开发团队成员的数量
    private static final int MAX_MEMBER = 5;
    private int currentMemberId = 1;//只增加不减少

    public TeamService() {
        team = new Programmer[MAX_MEMBER];
    }

    //添加一个团队成员
    public void addMember(Employee employee) throws TeamException {
        if (total >= MAX_MEMBER) {
            throw new TeamException("成员已满，无法添加");
        }
        if (!(employee instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员！");
        }
        //判断状态
        //父类对象先向下转型
        Programmer p = (Programmer) employee;
        switch (p.getStatus()) {
            case BUSY:
                throw new TeamException("该员已团队成员");
            case VOCATION:
                throw new TeamException("该员正在度假，无法添加");
        }

        //判断每一种人的人数
        int pCount = 0;
        int dCount = 0;
        int aCount = 0;
        //这里用total统计有几个人
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                aCount++;
            } else if (team[i] instanceof Designer) {
                dCount++;
            } else {
                pCount++;
            }
        }

        //如果人是什么，再看这种够不够
        if (employee instanceof Architect) {
            if (aCount >= 1) {
                throw new TeamException("团队中只能有一名架构师");
            }
        } else if (employee instanceof Designer) {
            if (dCount >= 2) {
                throw new TeamException("团队中只能有俩名架构师");
            }
        } else {
            if (pCount >= 3) {
                throw new TeamException("团队中只能有三名程序员");
            }
        }
        //可正常添加，
        //添加之前，修改状态，分配团队编号
        p.setStatus(Status.BUSY);
        p.setMemberId(currentMemberId++);
        team[total++] = p;
    }

    //返回所有团队成员的方法
    public Programmer[] getAllMembers() {
        return Arrays.copyOf(team, total);//复制数组
    }


    //根据团队编号删除团队成员
    public void removeMemberByTid(int tid) throws TeamException {
        int index = -1;
        for (int i = 0; i < total; i++) {
            if (team[i].getMemberId() == tid) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            throw new TeamException(tid + "的团队成员不存在！");//抛异常不try..catch,就要去前面throws 异常。
        }

        //先修改要被删除的成员的一些信息
        //team[index]这个成员要被删除
        team[index].setStatus(Status.FREE);
        team[index].setMemberId(0);
        //移动index后面的元素，往前移动

        /* * 如果记不住，如何推断
         * 第一个参数：原数组
         * 第二个参数：从哪里开始移动
         * 第三个参数：目标数组
         * 第四个参数：第二个参数的下标元素移动到哪个下标
         *
         * 假设total = 5个，删除index = 1位置的元素。
         * 移动[2] -> [1], [3] -> [2], [4] -> [3]  3个 = total - index -1
         * */

        System.arraycopy(team, index + 1, team, index, total - index - 1);
        team[total--] = null;
    }
}

