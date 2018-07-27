package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/*
*Test.
*
*@author Victor Baykov (vic.baykov89@gmail.com)
*@version $Id$
*@since 0.1
*/

public class FactorialTest {
    Factorial factorial = new Factorial();
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int res = factorial.calc(5);
        assertThat(res, is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int res = factorial.calc(0);
        assertThat(res, is(1));
    }
}
