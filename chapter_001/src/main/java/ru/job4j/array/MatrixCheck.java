package ru.job4j.array;

/**
 * Created by vicba on 31.07.2018.
 */
public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        int index = data.length;
            for (int i = 0; i < index; i++) {
                for (int j = 0; j < index; j++) {
                    if (((i == j) && (data[0][0] != data[i][j])) || (((index - i - 1) == (index - j - 1)) && (data[i][index - j - 1] != data[0][index - 1])))  {
                        result = false;
                        break;
                    }
                }
            }
        return result;
    }
}
