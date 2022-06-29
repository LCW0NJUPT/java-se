package d1603;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Test7 {
    static char[] a = {'-','-','-','-','-'};
    static char c = '*';

    static ReadWriteLock lock = new ReentrantReadWriteLock();


    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                while(true) {
                    Lock writeLock = lock.writeLock();  //得到排他的写锁
                    writeLock.lock();


                    for (int i = 0; i < a.length; i++) {
                        a[i] = c;
                    }

                    writeLock.unlock();

                    c = (c=='*'?'-':'*');
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                while(true) {
                    Lock readLock = lock.readLock();  //得到共享的读锁
                    readLock.lock();

                    System.out.println(Arrays.toString(a));

                    readLock.unlock();


                }
            }
        };

        t1.start();
        t2.start();
    }
}
