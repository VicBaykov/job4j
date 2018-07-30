package ru.job4j.array;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Created by vicba on 30.07.2018.
 */
public class Turn {

    public int[] turnBy(int[] start, Predicate<Integer> pred) {
        for (int i = 0;  pred.test(i); i++) {
            int tmp;
            tmp = start[start.length - i - 1];
            start[start.length - i - 1] = start[i];
            start[i] = tmp;
        }
        return start;
    }
    public int[] turnOdd(int[] array) {
        return turnBy(
                array,
                (i) -> i <= array.length / 2 - 1
        );
    }

    public int[] turnEven(int[] array) {
        return turnBy(
                array,
                (i) -> i < array.length / 2
        );
    }
    public int[] turn(int[] array) {
        for (int i = 0; (i <= array.length / 2 - 1) | (i < array.length / 2); i++) {
            int tmp;
            tmp = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = tmp;
        }
        return array;
    }
}
