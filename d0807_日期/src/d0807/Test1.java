package d0807;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();
        Date d2 = new Date(8L*60*60*1000);

        System.out.println(d1.getTime());
        System.out.println(d2.getTime());

        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        System.out.println(f.format(d1));
        System.out.println(f.format(d2));

        f = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("输入日期（yyyy-MM-dd）：");
        String s = new Scanner(System.in).nextLine();
        Date d3 = f.parse(s);
        System.out.println(d3);
    }
}
