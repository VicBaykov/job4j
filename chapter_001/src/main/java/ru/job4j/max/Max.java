package ru.job4j.max;

/**
 * Created by vicba on 25.07.2018.
 */
public class Max {
    private int max;
    public int max(int first, int second) {
        return (first > second) ? first : second;
    }

    public int max(int a, int b, int c) {
        max = max(max(a,b), c);
        return max;
    }
}
