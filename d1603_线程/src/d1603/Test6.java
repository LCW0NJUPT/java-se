package d1603;

import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;

public class Test6 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        //ExecutorService pool =Executors.newSingleThreadExecutor();
        //ExecutorService pool =Executors.newCachedThreadPool();

        //for(int i=0;i<1000;i++){
        Task1 t = new Task1(1);
            /*
            取餐条
            Callable任务：有返回值    可抛出任意异常
            Runnable任务：没有返回值   不可抛出异常
             */
        Future<?> f = pool.submit(t);
        //使用Future等待任务结束，并取餐
        System.out.println("此处等待任务结束");
        Long time = (Long) f.get();
        System.out.println("任务已经结束"+time);

        //销毁线程池中所有线程
        pool.shutdown();
        //}
    }

    static class  Task1 implements Callable<Long> {
        int id;//任务编号
        public Task1(int id){
            this.id = id;
        }

        @Override
        public Long call() throws Exception{
            String n = Thread.currentThread().getName();

                long time = new Random().nextInt(10000);
                Thread.sleep(time);
                System.out.println("任务名:"+id+" "+n);
                return time;

        }
    }
}
