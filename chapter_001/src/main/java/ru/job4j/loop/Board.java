package ru.job4j.loop;

/*
 *Board.
 *
 *@author Victor Baykov (vic.baykov89@gmail.com)
 *@version $Id$
 *@since 0.1
 */
public class Board {
    /**
     * Строит шахматную доску в псевдографике.
     * @param width Ширина поля
     * @param height Высота поля
     * @return Выводит на экран результат.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (((i + j) % 2 == 0)) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}
