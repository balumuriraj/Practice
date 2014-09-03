package com.mohanraj.sort;

import java.util.Arrays;

public class InsertionSort {

	public int[] insertSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one
			 * position ahead of their current position
			 */
			while ((arr[j] > key) && (j >= 0)) {
				arr[j + 1] = arr[j];
				j = j - 1;

				if (j < 0) {
					break;
				}
			}

			arr[j + 1] = key;

		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 44, 42, 7, 23, 9, 5, 10, 1, 34 };
		InsertionSort i = new InsertionSort();
		System.out.println(Arrays.toString(i.insertSort(arr)));
	}

}
