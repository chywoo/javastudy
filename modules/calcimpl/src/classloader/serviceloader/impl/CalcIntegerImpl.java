package classloader.serviceloader.impl;

import classloader.serviceloader.Calculator;

public class CalcIntegerImpl implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }
}
