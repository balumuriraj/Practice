package com.mohanraj.recursion;

public class Factorial {

	public int facto(int num) {
		int result;

		/*
		 * The common cause for a stack overflow is a bad recursive call.
		 * Typically this is caused when your recursive functions doesn't have
		 * the correct termination condition, so it ends up calling itself
		 * forever.
		 */

		if (num == 1 || num == 0) {
			return 1;
		}
		result = num * facto(num - 1);
		return result;
	}

	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println(f.facto(5));
	}

}
