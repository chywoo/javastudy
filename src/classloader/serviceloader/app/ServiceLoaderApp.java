package classloader.serviceloader.app;

import classloader.serviceloader.Calculator;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Service Loader에 대한 공부.
 * 관련 설명 URL: https://geekdani.wordpress.com/2012/08/18/10min-serviceloader/
 */
public class ServiceLoaderApp {
    public static void main(String[] args)
    {
        simpleServiceLoader();
    }

    private static void simpleServiceLoader() {
        ServiceLoader<Calculator> calcs = ServiceLoader.load(Calculator.class);

        Iterator<Calculator> calculatorIterator = calcs.iterator();
        if (calculatorIterator.hasNext())
            for (Calculator calc : calcs) {
                String str = String.format("1 + 1 = %d, 1 - 1 = %d", calc.add(1, 1), calc.sub(1, 1));
                System.out.println(str);
            }
        else
            System.out.println("Fail to load service provider.");
    }
}
