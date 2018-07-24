/*
*Test.
*/
package ru.job4j.calculate;

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
public class CalculateTest {
	/**
* Test echo.
*/
	@Test
	public void whenAddOnePlusOneThenTwo() {
		Calculate calc = new Calculate();
		calc.add(1d, 1d);
		double result = calc.getResult();
		double expected = 2d;
		assertThat(result, is(expected));/*это статический метод из класса org.junit.Assert.assertThat;
		*Этот метод принимает две переменных. result и Matcher.

		*Matcher - в данном примере - это методы статический метод из класса import static org.hamcrest.core.Is.is;

		*Он определяет как сравнивать две переменных result и except.

		*В этом примере он сравнивает значения. то есть

		*result == except - если объекты равны. то код выполняется успешно. если выражения не равны. то программа падает с ошибкой.
		*
		* */
	}

	@Test
	public void whenMultipleTwoTimesTwoThenFour() {
		Calculate calc = new Calculate();
		calc.multiple(2d, 2d);
		double result = calc.getResult();
		double expected = 4d;
		assertThat(result, is(expected));
	}

	@Test
	public void whenSubstractOneFromThreeThenTwo() {
		Calculate calc = new Calculate();
		calc.substract(3d, 1d);
		double result = calc.getResult();
		double expected = 2d;
		assertThat(result, is(expected));
	}

	@Test
	public void whenDivTwoByTwoThenOne() {
		Calculate calc = new Calculate();
		calc.div(2d, 2d);
		double result = calc.getResult();
		double expected = 1d;
		assertThat(result, is(expected));
	}
}