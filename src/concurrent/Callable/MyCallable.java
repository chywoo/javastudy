package concurrent.Callable;

import java.util.concurrent.Callable;

/**
 * Created by chywoo.park on 2017. 2. 22..
 */
public class MyCallable implements Callable<Long> {
    @Override
    public Long call() throws Exception {
        long sum = 0;

        for (long i=0; i <= 100; i++)
        {
            sum += i;
        }

        return sum;
    }
}
