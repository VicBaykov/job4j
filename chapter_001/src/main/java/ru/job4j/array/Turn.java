package ru.job4j.array;

import java.util.function.Predicate;

/*
 *Turn.
 *
 *@author Victor Baykov (vic.baykov89@gmail.com)
 *@version $Id$
 *@since 0.1
 */
public class Turn {

    /**
     * Сортирует элементы массива в обратном порядке. Через лямбда выражения.
     * @param array Входящий массив
     * @return Перевернутый массив
     */
    public int[] turnBy(int[] array, Predicate<Integer> pred) {
        for (int i = 0;  pred.test(i); i++) {
            int tmp;
            tmp = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = tmp;
        }
        return array;
    }

    /**
     * Сортирует элементы массива в обратном порядке. Для нечетного количества элементов. Через лямбда-выражения
     * @param array Входящий массив
     * @return Перевернутый массив
     */
    public int[] turnOdd(int[] array) {
        return turnBy(
                array,
                (i) -> i <= array.length / 2 - 1
        );
    }

    /**
     * Сортирует элементы массива в обратном порядке. Для четного количества элементов. Через лямбда-выражения
     * @param array Входящий массив
     * @return Перевернутый массив
     */
    public int[] turnEven(int[] array) {
        return turnBy(
                array,
                (i) -> i < array.length / 2
        );
    }

    /**
     * Сортирует элементы массива в обратном порядке.
     * @param array Входящий массив
     * @return Перевернутый массив
     */
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
