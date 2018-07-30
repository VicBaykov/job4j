package ru.job4j.array;

/**
 * Created by vicba on 30.07.2018.
 */
public class Check {
    public boolean mono(boolean[] data) {
        for (boolean dat: data) {
            if (dat == false) {
                return false;
            }

        }
        return true;
    }
}
