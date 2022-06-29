package d0101;


import java.util.Date;
import java.util.*;
//包装类
public class IntergerDemo {

    public static void main(String[] args) {
        //日期
        Date date = new Date();
        long time = date.getTime();
        System.out.println("time:"+time);

        Integer a = 10;
        Integer c = 10;
        Integer b = a;
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        double r = Math.random();
        System.out.println(r);
        System.out.println(Math.sqrt(4));
        System.out.println(Math.sqrt(-100)); //NaN
        System.out.println(Math.PI);
        double assss = 4d;

//        byte aaa = 3;
//        byte baa = 4;
//        byte caa = aaa + baa;

        byte aaa = 127;
        System.out.println(aaa + 1);


    }


}
