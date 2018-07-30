package ru.job4j.array;

/**
 * Created by vicba on 30.07.2018.
 */
public class Check {
    public boolean mono(boolean[] data) {
        int i = 0;
        for (boolean dat: data) {
            if (data[0] != dat) {
                return false;
            }
            i++;
        }
        return true;
    }
}
