package jp.ac.uryukyu.ie.e175761;

public class LeapYear{
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
