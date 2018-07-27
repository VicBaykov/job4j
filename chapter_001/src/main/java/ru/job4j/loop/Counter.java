package ru.job4j.loop;

/**
 * Created by vicba on 27.07.2018.
 */
public class Counter {

    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish ; i++) {
            if (i % 2 == 0) sum += i;
        }
        return sum;
    }
}
