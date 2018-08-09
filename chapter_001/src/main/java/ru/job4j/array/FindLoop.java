package ru.job4j.array;

/*
 *FindLoop.
 *
 *@author Victor Baykov (vic.baykov89@gmail.com)
 *@version $Id$
 *@since 0.1
 */
public class FindLoop {
    /**
     * Ищет элемент массива.
     * @param data Массив, в котором нужно произвести поиск.
     * @param el Элемент который нужно найти
     * @return Возвращает индекс искомого элемента.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
