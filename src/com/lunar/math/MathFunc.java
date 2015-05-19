package com.lunar.math;

public class MathFunc {
	/**
	 * example: sumEachCharacterOfNumber(1230) -> return 6
	 * */
	public static int sumEachCharacterOfNumber( int number ) {
		int num = Math.abs(number);
		int sum = 0;
		int mod;
		while (num >= 10) {
			mod = num % 10;
			num = num / 10;
			sum += mod;
		}
		sum += num;
		return sum;
	}
}
