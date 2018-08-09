package ru.job4j.array;

import java.util.Arrays;

/*
 *ArrayDuplicate.
 *
 *@author Victor Baykov (vic.baykov89@gmail.com)
 *@version $Id$
 *@since 0.1
 */
public class ArrayDuplicate {
    /**
     * Удаляет дублирующие элементы из массива.
     * @param array Входной массив.
     * @return Возвращает массив с удаленными дубликатами.
     */
    public String[] remove(String[] array) {
        int index = array.length;
        for (int i = 0; i < index; i++) {
            for (int j = i + 1; j < index; j++) {
                if (array[i].equals(array[j])) {
                    array[j] = array[index - 1];
                    index--;
                    j--;
                }

            }
        }
        array = Arrays.copyOf(array, index);
        return array;
    }
}
