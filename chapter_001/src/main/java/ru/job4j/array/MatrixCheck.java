package ru.job4j.array;

/**
 * Created by vicba on 31.07.2018.
 */
public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        if (this.allEqualsOnMainDiagonal(data) || this.allEqualsOnSecondaryDiagonal(data)) {
            return true;
        }
        return false;
    }


    public boolean allEqualsOnMainDiagonal(boolean[][] data) {
        boolean result = true;
        int index = data.length;
        for (int i = 0; i < index; i++) {
            if (data[i][i] != data[index - 1][index - 1]) {
                result = false;
                break;
            }
        }
        return result;

    }

    public boolean allEqualsOnSecondaryDiagonal(boolean[][] data) {
        boolean result = true;
        int index = data.length;
        for (int i = 0; i < index; i++) {
            if (data[index - i - 1][i] != data[0][index - 1]) {
                result = false;
                break;
            }
        }
        return result;

    }
}
