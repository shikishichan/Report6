package jp.ac.uryukyu.ie.e175761;

public class Judge {
    //数字の判定を行う。

    public int judge(boolean ahoo, int month){
        /*閏年かにより用いるint型配列を変える。
        　そのint型配列を誕生月から選び、intで返す。
         */
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
        //誕生年により返すintを返す。
        if(year < 2000){
            return 0;
        }else{
            return 6;
        }
    }

    public boolean jLeapYear(int jYear){
        //閏年か判定する。
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
