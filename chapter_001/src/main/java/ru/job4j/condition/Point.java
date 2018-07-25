package ru.job4j.condition;

/*
 *@author Victor Baykov (vic.baykov89@gmail.com)
 *@version $Id$
 *@since 0.1
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point point) {
        return Math.sqrt(Math.pow((point.x - this.x), 2) + Math.pow((point.y - this.y), 2));
    }
}
