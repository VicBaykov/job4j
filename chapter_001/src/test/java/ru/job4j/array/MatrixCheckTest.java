package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by vicba on 31.07.2018.
 */
public class MatrixCheckTest {
    @Test
    public void when3on3TrueTrue() {
        MatrixCheck matrix = new MatrixCheck();
        boolean[][] start = {
                {true, true, true},
                {false, true, true},
                {true, false, true}
        };
        boolean res = matrix.mono(start);
        boolean expect = true;
        assertThat(res, is(expect));
    }



    @Test
    public void when3on3FalseFalse() {
        MatrixCheck matrix = new MatrixCheck();
        boolean[][] input = {
                {true, true, false},
                {false, false, true},
                {false, false, false}
        };
        boolean res = matrix.mono(input);
        boolean expect = true;
        assertThat(res, is(expect));
    }

    @Test
    public void when3on3TrueFalse() {
        MatrixCheck matrix = new MatrixCheck();
        boolean[][] start = {
                {true, true, true},
                {false, false, true},
                {true, false, true}
        };
        boolean res = matrix.mono(start);
        boolean expect = false;
        assertThat(res, is(expect));
    }
    @Test
    public void when2on2TrueTrue() {
        MatrixCheck matrix = new MatrixCheck();
        boolean[][] start = {
                {true, true},
                {false, true}
        };
        boolean res = matrix.mono(start);
        boolean expect = true;
        assertThat(res, is(expect));
    }

    @Test
    public void when2on2FalseTrue() {
        MatrixCheck matrix = new MatrixCheck();
        boolean[][] start = {
                {true, false},
                {false, true}
        };
        boolean res = matrix.mono(start);
        boolean expect = true;
        assertThat(res, is(expect));
    }

}
