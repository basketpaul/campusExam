package bytedance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = "";
        for(int i = 0;i < T;i ++){
            int year = sc.nextInt(),month = sc.nextInt(),day = sc.nextInt();
            dateStr = year + "-" + month + "-" + day;
            Date date = format.parse(dateStr);
            caculate(date);
        }
    }

    private static void caculate(Date date) throws ParseException {
        String byteDance = "2012-3-12";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date dance = format.parse(byteDance);

        int days = (int)((date.getTime() - dance.getTime()) / (1000 * 3600 * 24));
        System.out.println(days);
    }

}