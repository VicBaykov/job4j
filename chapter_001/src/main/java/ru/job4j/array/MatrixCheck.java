package ru.job4j.array;

import java.util.function.Predicate;

/**
 * Created by vicba on 31.07.2018.
 */
public class MatrixCheck {

    public boolean mono(boolean[][] data) {
        if (this.allDiagonalsEquals(
                data,
                (i) -> data[i][i] != data[data.length - 1][data.length - 1])
                || this.allDiagonalsEquals(
                        data,
                (i) -> data[data.length - i - 1][i] != data[0][data.length - 1])) {
            return true;
        }
        return false;
    }

    public boolean allDiagonalsEquals(boolean[][] data, Predicate<Integer> pred) {
        boolean result = true;
        int index = data.length;
        for (int i = 0; i < index; i++) {
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
