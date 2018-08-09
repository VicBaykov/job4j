package ru.job4j.array;

/*
 *BubbleSort.
 *
 *@author Victor Baykov (vic.baykov89@gmail.com)
 *@version $Id$
 *@since 0.1
 */
public class BubbleSort {
    /**
     * Сортирует элементы массива в порядке возрастания.
     * @param array Массив, который нужно отсортировать.
     * @return Возвращает отсортированный массив.
     */
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
