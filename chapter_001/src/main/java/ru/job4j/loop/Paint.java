package ru.job4j.loop;


import java.util.function.BiPredicate;
/*
 *Paint.
 *
 *@author Victor Baykov (vic.baykov89@gmail.com)
 *@version $Id$
 *@since 0.1
 */
public class Paint {
    /**
     * Строит пирамиду в псевдографике
     * @param height Высота пирамиды
     * @param  width Ширина пирамиды
     * @return Отображает пирамиду.
     */
    private String loopBy(int height, int width, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    /**
     * Строит пирамиду в псевдографике
     * @param height Высота пирамиды
     * @return Строит правую часть пирамиды.
     */
    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }

    /**
     * Строит пирамиду в псевдографике
     * @param height Высота пирамиды
     * @return Строит левую часть пирамиды.
     */
    public String leftTrl(int height) {
        return loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }

    /**
     * Строит пирамиду в псевдографике
     * @param height Высота пирамиды
     * @return Строит пирамиду целиком.
     */
    public String pyramid(int height) {
        return loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }
}
