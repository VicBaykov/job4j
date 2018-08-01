package ru.job4j.array;

/**
 * Created by vicba on 31.07.2018.
 */
public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        int index = data.length;
            for (int i = 0; i < index; i++) {
                    if ((data[0][0] != data[i][i]) || (data[i][index - i - 1] != data[0][index - 1]))  {
                        result = false;
                        break;
                    }
            }
        return result;
    }
}
