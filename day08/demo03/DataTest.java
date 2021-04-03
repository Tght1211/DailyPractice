package day08.demo03;

public class DataTest {
    public static void main(String[] args) {
        MyData my = new MyData();
        my.year = 2021;
        my.month = 2;
        my.day = 15;
        my.plus(1, 1, 1);
        System.out.println(my.year + "年" + my.month + "月" + my.day + "日");
    }
}

class MyData {
    int year;
    int month;
    int day;

    boolean isLeapYear() {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;//返回结果并结束方法
        }
        return false;
    }

    void set(int y, int m, int d) {
        year = y;
        month = m;
        day = d;
    }

    //日期修改(在原有的基础上增加)
    void plus(int y, int m, int d) {
        year += y;
        month += m;
        day += d;
        while (true) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (day > 31) {
                    day -= 31;
                    month++;
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day > 30) {
                    day -= 30;
                    month++;
                }
            } else if (month == 2) {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {//闰年
                    if (day > 29) {
                        day -= 29;
                        month++;
                    }
                } else {
                    if (day > 28) {
                        day -= 28;
                        month++;
                    }
                }
            } else if (month == 12) {
                if (day > 31) {
                    day -= 31;
                    month = 1;
                    year++;
                }
            }else if(month > 12){
                while(month>12){
                    month -= 12;
                    year++;
                }
            }
//                while (month > 12){
//                    month -= 12;
//                    year++;
//                }
//                if (day > 31) {
//                    day -= 31;
//                    month++;
//                    month -= 12;
//                    year++;
//                }

            //判断条件准备退出
            if (month >= 1 && month <= 12) {
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                    if (day < 31) {
                        break;
                    }
                } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    if (day < 30) {
                        break;
                    }
                } else if (month == 2) {
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        if (day <= 29) {
                            break;
                        }
                    } else {
                        if (day < 28) {
                            break;
                        }
                    }
                }

            }
        }
    }
}
