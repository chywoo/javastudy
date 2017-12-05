package concurrent.Callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.Future;

/**
 * Callalbe 기본 사용법
 */
public class CallableApp {

    public static void main(String[] args) throws InterruptedException {
        // We will store the threads so that we can check if they are done
        ExecutorService executor = Executors.newFixedThreadPool(10);
        List<Future<Long>> list = new ArrayList<>();

        // We will create 500 threads
        for (int i = 0; i < 20000; i++) {
            Callable<Long> worker = new MyCallable();
            Future<Long> submit = executor.submit(worker);
            list.add(submit);

        }

        long sum = 0;
        System.out.println(list.size());

        for (Future<Long> future: list)
        {
            try {
                sum += future.get();
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        System.out.println(sum);
        executor.shutdown();

    }
}