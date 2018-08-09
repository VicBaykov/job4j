package ru.job4j.array;

/*
 *Square.
 *
 *@author Victor Baykov (vic.baykov89@gmail.com)
 *@version $Id$
 *@since 0.1
 */
public class Square {
    /**
     * Заполняет массив квадратами чисел.
     * @param bound Верхняя граница диапазона
     * @return массив заполненый квадратами числе от 1 до bound
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = (i + 1) * (i + 1);
        }
        return rst;
    }
}
