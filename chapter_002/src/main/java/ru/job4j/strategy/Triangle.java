package ru.job4j.strategy;

/**
 * Created by vicba on 08.09.2018.
 */
public class Triangle implements Shape {
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("   *   ");
        pic.append("  * *  ");
        pic.append(" *   * ");
        pic.append("*******");
        return pic.toString();
    }
}
