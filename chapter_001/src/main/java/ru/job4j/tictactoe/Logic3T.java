package ru.job4j.tictactoe;

import java.util.function.Predicate;

/*
 *Logic3T.
 *
 *@author Victor Baykov (vic.baykov89@gmail.com)
 *@version $Id$
 *@since 0.1
 */
public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    /**
     * Проверяет выиграл ли игрок X
     * @return Возвращает true, если выиграл игрок X false если не выиграл.
     */
    public boolean isWinnerX() {
        return isWinCombo(Figure3T::hasMarkX, 0, 0, 0, 1)
                | isWinCombo(Figure3T::hasMarkX, 1, 0, 0, 1)
                | isWinCombo(Figure3T::hasMarkX, 2, 0, 0, 1)
                | isWinCombo(Figure3T::hasMarkX, 0, 0, 1, 0)
                | isWinCombo(Figure3T::hasMarkX, 0, 1, 1, 0)
                | isWinCombo(Figure3T::hasMarkX, 0, 2, 1, 0)
                | isWinCombo(Figure3T::hasMarkX, 0, 0, 1, 1)
                | isWinCombo(Figure3T::hasMarkX, this.table.length - 1, 0, -1, 1);


    }

    /**
     * Проверяет выиграл ли игрок O
     * @return Возвращает true, если выиграл игрок O false если не выиграл.
     */
    public boolean isWinnerO() {

        return isWinCombo(Figure3T::hasMarkO, 0, 0, 0, 1)
                | isWinCombo(Figure3T::hasMarkO, 1, 0, 0, 1)
                | isWinCombo(Figure3T::hasMarkO, 2, 0, 0, 1)
                | isWinCombo(Figure3T::hasMarkO, 0, 0, 1, 0)
                | isWinCombo(Figure3T::hasMarkO, 0, 1, 1, 0)
                | isWinCombo(Figure3T::hasMarkO, 0, 2, 1, 0)
                | isWinCombo(Figure3T::hasMarkO, 0, 0, 1, 1)
                | isWinCombo(Figure3T::hasMarkO, this.table.length - 1, 0, -1, 1);
    }

    /**
     * Проверяет выигрышные комбинации
     * @param x Нчальная координата поля по оси X
     * @param y Нчальная координата поля по оси Y
     * @param stepX Шаг проходки по оси X
     * @param stepY Шаг проходки по оси Y
     * @param pred условие проверки
     * @return Возвращает true если на поле есть выигрышная кобинация
     */
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

    /**
     * Проверяет остались ли пустые поля.
     * @return Возвращает true, если на поле есть пустые клетки, false - если нет.
     */
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
