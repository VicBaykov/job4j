package ru.job4j.max;

/*
 *Max.
 *
 *@author Victor Baykov (vic.baykov89@gmail.com)
 *@version $Id$
 *@since 0.1
 */
public class Max {
    /**
     * Вычисляет максимум из двух чисел
     * @param first Первое число
     * @param second Второе число
     * @return Возвращает максимум.
     */
    public int max(int first, int second) {
        return (first > second) ? first : second;
    }

    /**
     * Вычисляет максимум из трех чисел
     * @param a Первое число
     * @param b Второе число
     * @param c Третье число
     * @return Возвращает максимум.
     */
    public int max(int a, int b, int c) {
        return max(max(a, b), c);
    }
}
