package ru.job4j.array;

/**
 * Created by vicba on 31.07.2018.
 */
public class BubbleSort {
    public int[] sort(int[] array) {
        int buff;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    buff = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buff;
                }
            }

        }
        return array;
    }
}
