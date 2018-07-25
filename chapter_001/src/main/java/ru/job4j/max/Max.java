package ru.job4j.max;

/**
 * Created by vicba on 25.07.2018.
 */
public class Max {
    private int max;
    public int max(int first, int second) {

        max = (first > second) ? first : second;
        /*if (first > second) {
            max = first;
        } else if (first < second) {
            max = second;
        }*/
        return max;
    }

    public int max(int a, int b, int c) {
        int temp = this.max(a, b);
        max = max(temp, c);
        return max;
    }
}
