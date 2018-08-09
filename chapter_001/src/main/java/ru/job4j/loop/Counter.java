package ru.job4j.loop;

/*
 *Counter.
 *
 *@author Victor Baykov (vic.baykov89@gmail.com)
 *@version $Id$
 *@since 0.1
 */
public class Counter {
    /**
     * Вычисляет сумму четных чисел в диапазоне
     * @param start Начало отсчета
     * @param finish Конец отсчета
     * @return Возвращает сумму четных чисел.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
