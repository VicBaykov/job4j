package ru.job4j.tictactoe;

import java.util.function.Predicate;

/**
 * Created by vicba on 06.08.2018.
 */
public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    public boolean isWinnerX() {
        return isWinCombo(Figure3T::hasMarkX, 0, 0, 0, 1) |
                isWinCombo(Figure3T::hasMarkX, 1, 0, 0, 1) |
                isWinCombo(Figure3T::hasMarkX, 2, 0, 0, 1) |
                isWinCombo(Figure3T::hasMarkX, 0, 0, 1, 0) |
                isWinCombo(Figure3T::hasMarkX, 0, 1, 1, 0) |
                isWinCombo(Figure3T::hasMarkX, 0, 2, 1, 0) |
                isWinCombo(Figure3T::hasMarkX, 0, 0, 1, 1) |
                isWinCombo(Figure3T::hasMarkX, this.table.length - 1, 0, -1, 1);


    }

    public boolean isWinnerO() {

        return isWinCombo(Figure3T::hasMarkO, 0, 0, 0, 1) |
                isWinCombo(Figure3T::hasMarkO, 1, 0, 0, 1) |
                isWinCombo(Figure3T::hasMarkO, 2, 0, 0, 1) |
                isWinCombo(Figure3T::hasMarkO, 0, 0, 1, 0) |
                isWinCombo(Figure3T::hasMarkO, 0, 1, 1, 0) |
                isWinCombo(Figure3T::hasMarkO, 0, 2, 1, 0) |
                isWinCombo(Figure3T::hasMarkO, 0, 0, 1, 1) |
                isWinCombo(Figure3T::hasMarkO, this.table.length - 1, 0, -1, 1);
    }

    public boolean isWinCombo(Predicate<Figure3T> pred, int x, int y, int stepX, int stepY) {
        boolean res = true;
        for (int i = 0; i != this.table.length; i++) {
            Figure3T cell = this.table[x][y];
            x += stepX;
            y += stepY;
            if (!pred.test(cell)) {
                res = false;
                break;
            }

        }
        return res;
    }

    public boolean hasGap() {
        for (int i = 0; i < this.table.length; i++) {
            for (int j = 0; j < this.table[i].length; j++) {
                if (!(this.table[i][j].hasMarkX() || this.table[i][j].hasMarkO())) {
                    return true;
                }
            }
        }
        return false;
    }
}
