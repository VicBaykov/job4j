package ru.job4j.array;

/*
 *Check.
 *
 *@author Victor Baykov (vic.baykov89@gmail.com)
 *@version $Id$
 *@since 0.1
 */
public class Check {
    /**
     * Проверяет заполнен массив true или  false.
     * @param data Массив, который нужно проверить.
     * @return Возвращает true если все элементы массива одинаковы и false если нет.
     */
    public boolean mono(boolean[] data) {
        int i = 0;
        boolean res = true;
        for (boolean dat: data) {
            if (data[0] != dat) {
                res = false;
                break;
            }
            i++;
            res = true;
        }
        return res;
    }
}
