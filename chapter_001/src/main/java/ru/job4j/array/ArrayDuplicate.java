package ru.job4j.array;

import java.util.Arrays;

/**
 * Created by vicba on 01.08.2018.
 */
public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int index = array.length;
        for (int i = 0; i < index; i++) {
            for (int j = i + 1; j < index; j++) {
                if (array[i].equals(array[j])) {
                    array[j] = array[index - 1];
                    index--;
                }

            }
        }
        array = Arrays.copyOf(array, index);
        return array;
    }
}
