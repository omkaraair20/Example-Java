package october_28_2024;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestAll {
    public static void main(String[] args) {
        ExecutorService me= Executors.newSingleThreadExecutor();
        //ExecutorService me=Executors.newFixedThreadPool(5);
        //ExecutorService me=Executors.newCachedThreadPool();

        Runnable t1=new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println("Task1.....");
            }
        };
        Runnable t2=() ->{
            System.out.println(Thread.currentThread().getName());
            System.out.println("Task2......");
        };

        me.execute(t1);
        me.execute(t2);
        //me.execute(new threadone());
    }
}


