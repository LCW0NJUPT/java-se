package d1504;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {

        Thread t1 = new Thread(){
            @Override
            public void run(){
                while(true){
                    now();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("被异常唤醒");
                    }

                }
            }

        };
        t1.start();

        while (true){
            new Scanner(System.in).nextLine();
            t1.interrupt();
        }
    }

    static  void now(){
        Date d = new Date();
        String s = new SimpleDateFormat("HH:mm:ss").format(d);
        System.out.println(s);
    }
}
