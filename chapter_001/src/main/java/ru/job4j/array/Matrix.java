package ru.job4j.array;

/*
 *Matrix.
 *
 *@author Victor Baykov (vic.baykov89@gmail.com)
 *@version $Id$
 *@since 0.1
 */
public class Matrix {
    /**
     * Возвращает массив с элементами таблицы умножения.
     * @param size Размер массива.
     * @return Возвращает массив с элементами таблицы умножения.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
