package d1603;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test5 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        //ExecutorService pool =Executors.newSingleThreadExecutor();
        //ExecutorService pool =Executors.newCachedThreadPool();

        //for(int i=0;i<1000;i++){
            Task1 t = new Task1(1);
            /*
            取餐条
            使用Future可以等待任务结束
            如果任务有运算结果，也可以使用Future获取结果
             */
            Future<?> f = pool.submit(t);
            System.out.println("此处等待任务结束");
            f.get();
            System.out.println("任务已经结束");

            //销毁线程池中所有线程
            pool.shutdown();
        //}
    }

    static class  Task1 implements Runnable{
        int id;//任务编号
        public Task1(int id){
            this.id = id;
        }

        @Override
        public void run(){
            String n = Thread.currentThread().getName();

            try{
                Thread.sleep(new Random().nextInt(10000));
                System.out.println("任务名:"+id+" "+n);
            }catch (InterruptedException e){
            }
        }
    }
}
