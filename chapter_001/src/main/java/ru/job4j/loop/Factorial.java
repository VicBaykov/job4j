package ru.job4j.loop;

/**
 * Created by vicba on 27.07.2018.
 */
public class Factorial {
    public int calc(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {

            fact = fact * i;
        }
        return fact;
    }
}
