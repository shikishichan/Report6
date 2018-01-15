package jp.ac.uryukyu.ie.e175761;

public class Judge {


    public int judge(boolean ahoo, int month){
        int [] ml;
        if(ahoo == true) {
            ml = new int[]{1, 4, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6};
            return ml[month-1];
        }else{
            ml = new int[]{0, 3, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6};
            return ml[month-1];
        }
    }

    public int yJudge (int year){
        if(year < 2000){
            return 0;
        }else{
            return 6;
        }
    }

    public boolean jLeapYear(int jYear){
        if(jYear % 4 == 0) {
            if(jYear % 100 == 0) {
                if(jYear % 400 == 0) {
                    return false;
                } else {
                    return true;
                }
            }else{
                return false;
            }
        }else{
            return true;
        }
    }
}
