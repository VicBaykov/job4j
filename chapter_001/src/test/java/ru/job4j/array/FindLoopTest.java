package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by vicba on 29.07.2018.
 */
public class FindLoopTest {
    FindLoop find = new FindLoop();
    int[] input = new int[] {5, 10, 3};
    @Test
    public void whenArrayHasLengh5Then0() {
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHasLengh5ThenNone() {
        int value = 6;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }


}
