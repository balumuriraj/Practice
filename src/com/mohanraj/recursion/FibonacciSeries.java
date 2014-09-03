package com.mohanraj.recursion;

public class FibonacciSeries {

	public int fibonacci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			int f1 = 1;
			int f2 = 1;
			int result = 1;
			for (int i = 3; i <= n; i++) {
				result = f1 + f2;
				f1 = f2;
				f2 = result;
			}
			return result;
		}
	}

	public static void main(String[] args) {
		int n = 15;
		FibonacciSeries f = new FibonacciSeries();
		for (int i = 1; i <= n; i++) {
			System.out.print(f.fibonacci(i) + " ");
		}
	}
}
