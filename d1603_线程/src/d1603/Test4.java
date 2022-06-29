package d1603;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test4 {
    public static void main(String[] args) {
        //ExecutorService pool = Executors.newFixedThreadPool(5);
        //ExecutorService pool =Executors.newSingleThreadExecutor();
        ExecutorService pool =Executors.newCachedThreadPool();

        for(int i=0;i<1000;i++){
            Task1 t = new Task1(i);
            pool.execute(t);
        }
    }

    static class  Task1 implements Runnable{
        int id;//任务编号
        public Task1(int id){
            this.id = id;
        }

        @Override
        public void run(){
            String n = Thread.currentThread().getName();
            System.out.println("任务名:"+id+" "+n);
        }
    }
}
