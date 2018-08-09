package ru.job4j.array;

import java.util.function.Predicate;

/*
 *MatrixCheck.
 *
 *@author Victor Baykov (vic.baykov89@gmail.com)
 *@version $Id$
 *@since 0.1
 */
public class MatrixCheck {
    /**
     * Проверяет одинаковые ли элементы диагонали матрицы
     * @param data Массив, в котором нужно произвести проверку.
     * @return Возвращает true если обе диагонали заполнены одинаковыми элементами, false если нет.
     */
    public boolean mono(boolean[][] data) {
        boolean res = true;
        int size = data.length;
        /*if (this.allDiagonalsEquals(
                data,
                (i) -> data[i][i] != data[data.length - 1][data.length - 1])
                && this.allDiagonalsEquals(
                        data,
                (i) -> data[data.length - i - 1][i] != data[0][data.length - 1])) {
            return true;
        }*/
        for (int i = 1; i < size; i++) {
            if ((data[0][0] != data[i][i]) || (data[i][size - i - 1] != data[0][size - 1])) {
                res = false;
                break;
            }
        }
        return res;
    }

    /**
     * Проверяет одинаковые ли элементы диагонали матрицы. С использованием лямбда-выражений.
     * @param data Массив, в котором нужно произвести проверку.
     * @param pred Условие на проверку ячеек массива.
     * @return Возвращает true если обе диагонали заполнены одинаковыми элементами, false если нет.
     */
    public boolean allDiagonalsEquals(boolean[][] data, Predicate<Integer> pred) {
        boolean result = true;
        int size = data.length;
        for (int i = 0; i < size; i++) {
            if (pred.test(i)) {
                result = false;
                break;
            }
        }
        return result;
    }


//    public boolean allEqualsOnMainDiagonal(boolean[][] data) {
//        boolean result = true;
//        int index = data.length;
//        for (int i = 0; i < index; i++) {
//            if (data[i][i] != data[index - 1][index - 1]) {
//                result = false;
//                break;
//            }
//        }
//        return result;
//
//    }
//
//    public boolean allEqualsOnSecondaryDiagonal(boolean[][] data) {
//        boolean result = true;
//        int index = data.length;
//        for (int i = 0; i < index; i++) {
//            if (data[index - i - 1][i] != data[0][index - 1]) {
//                result = false;
//                break;
//            }
//        }
//        return result;
//
//    }
}
