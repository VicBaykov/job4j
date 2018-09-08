package ru.job4j.strategy;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by vicba on 08.09.2018.
 */
public class TriangleTest {
    @Test
    public void whenDrawTriangle() {
        Square square = new Square();
        assertThat(square.draw(), is(
                new StringBuilder()
                        .append("   *   ")
                        .append("  * *  ")
                        .append(" *   * ")
                        .append("*******")
                        .toString()

        ));

    }
}
