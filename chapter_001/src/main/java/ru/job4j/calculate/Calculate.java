/*
*Calculator.
*/
package ru.job4j.calculate;

/*
 *Calculate.
 *
 *@author Victor Baykov (vic.baykov89@gmail.com)
 *@version $Id$
 *@since 0.1
 */
public class Calculate {
	/*
	*Main.
	*@param args - args.
	*/
	private double result;
	void add(double first, double second) {
		this.result = first + second;
	}

	void substract(double first, double second) {
		this.result = first - second;
	}

	void multiple(double first, double second) {
		this.result = first * second;
	}

	void div(double first, double second) {
		this.result = first / second;
	}

	public double getResult() {
		return this.result;
	}

}