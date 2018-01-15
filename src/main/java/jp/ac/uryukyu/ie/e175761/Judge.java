package jp.ac.uryukyu.ie.e175761;

public class Judge {
    int[] ml;
    public void judge(boolean jLeapYear(year)){
        if(jLeapYear(year) == true) {
            ml = new int[]{1, 4, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6};
            ano = ml[month-1];
        }else{
            ml = new int[]{0, 3, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6};
            ano = ml[month-1];
        }
    }

    public void yJudge (int year){
        if (year < 1900){

        }else if(year < 2000){
            etto = 0;
        }else if(year < 2100){
            etto =6;
        }else{

        }
    }

    public int ans(){
        answer = day + uYear + uPYear + ano + etto;
        answer = answer % 7;
    }
}
