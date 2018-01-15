package jp.ac.uryukyu.ie.e175761;
import java.util.Scanner;

public class Receive {
    private int day;
    private int year;
    private int month;
    boolean ab;
    int aaa;
    int aaaa;
    public int getDay(){
        return day;
    }

    public int getYear(){
        return year;
    }

    public int getMonth() {
        return month;
    }

    public Receive(int year,int month,int day){
        this.year=year;
        this.month = month;
        this.day = day;
    }
    public int receive(){
        int uYear = getYear()/100;
        uYear = getYear() - uYear*100;
        int uPYear = uYear/ 4;
        Judge abc = new Judge();
        ab = abc.jLeapYear(getYear());
        aaa = abc.judge(ab,getMonth());
        aaaa = abc.yJudge(getYear());
        int answer = getDay() + uYear + uPYear + aaa + aaaa;
        return answer%7;
    }


}



