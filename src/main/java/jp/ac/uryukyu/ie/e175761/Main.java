package jp.ac.uryukyu.ie.e175761;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("あなたの生まれた日が何曜日か当てます。");
        System.out.println("あなたの生まれた年はいつかな？");
        int year= in.nextInt();
        System.out.println("あなたの生まれた月はいつかな？");
        int month = in.nextInt();
        System.out.println("あなたの生まれた日はいつかな？");
        int day = in.nextInt();
        Receive r = new Receive(year,month,day);
        String [] date = {"土曜日","日曜日","月曜日","火曜日","水曜日","木曜日","金曜日"};
        System.out.println("あなたの生まれた日は"+date[r.receive()]+"かな。");
    }
}
