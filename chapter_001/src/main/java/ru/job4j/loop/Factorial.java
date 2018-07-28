package ru.job4j.loop;

/**
 * Created by vicba on 27.07.2018.
 */
public class Factorial {
    public int calc(int n) {
        int fact = 0;
        for (int i = 0; i <= n; i++) {
            fact = (i == 0) ? 1 : fact * i;
        }
        return fact;
    }
}
