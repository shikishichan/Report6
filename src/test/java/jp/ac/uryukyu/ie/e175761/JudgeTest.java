package jp.ac.uryukyu.ie.e175761;

import org.junit.Test;

import static org.junit.Assert.*;

public class JudgeTest {
    @Test
    public void jLeapYear() {
        int jYear = 1997;
        boolean tes;
        if(jYear % 4 == 0) {
            if(jYear % 100 == 0) {
                if(jYear % 400 == 0) {
                   tes = false;
                } else {
                    tes = true;
                }
            }else{
                tes = false;
            }
        }else{
            tes = true;
        }

        if(tes == true){
        }else{
            System.out.println("あかん");
        }
    }


}