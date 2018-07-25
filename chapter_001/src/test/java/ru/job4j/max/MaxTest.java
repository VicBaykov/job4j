/*
*Test.
*/
package ru.job4j.max;

import org.junit.Test;
import ru.job4j.calculate.Calculate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/*
*Test.
*
*@author Victor Baykov (vic.baykov89@gmail.com)
*@version $Id$
*@since 0.1
*/
public class MaxTest {
	/**
* Test echo.
*/
	@Test
	public void whenFirstLessSecond() {
		Max maxim = new Max();
		int result = maxim.max(1, 2);
		assertThat(result, is(2));
		result = maxim.max(1, 2, 3);
		assertThat(result, is(3));
	}


}