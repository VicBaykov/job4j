package ru.job4j.loop;

/*
 *Factorial.
 *
 *@author Victor Baykov (vic.baykov89@gmail.com)
 *@version $Id$
 *@since 0.1
 */
public class Factorial {
    /**
     * Вычисляет факториал n чисел
     * @param n Верхняя граница
     * @return Возвращает факториал.
     */
    public int calc(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
