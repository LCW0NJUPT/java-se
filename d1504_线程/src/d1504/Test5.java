package d1504;

import jdk.nashorn.internal.ir.WhileNode;
import sun.font.TrueTypeFont;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    now();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }.start();
    }

    static void now() {
        Date d = new Date();
        String s = new SimpleDateFormat("HH:mm:ss").format(d);
        System.out.println(s);
    }
}

