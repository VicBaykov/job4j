package ru.job4j.array;

/**
 * Created by vicba on 31.07.2018.
 */
public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data.length; j++) {
                    if ((i == j) && (data[0][0] != data[i][j])) {
                        result = false;
                        break;
                    }

                }

            }
        return result;
    }
}
