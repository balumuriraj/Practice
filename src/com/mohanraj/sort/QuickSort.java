package com.mohanraj.sort;

import java.util.Arrays;

public class QuickSort {
	
	/* This function takes last element as pivot, places the pivot element at its
	   correct position in sorted array, and places all smaller (smaller than pivot)
	   to left of pivot and all greater elements to right of pivot */
	public int partition(int[] arr, int first, int last){
		int pivotval = arr[last];
		int i = first;
		
		for(int j = first; j < last; j++){
			// If current element is smaller than or equal to pivot
			if(arr[j] <= pivotval){
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				
				i++;
			}
		}
		
		arr[last] = arr[i];
		arr[i] = pivotval;
		return i;
	}
	
	public int[] quiSort(int[] arr, int first, int last){
		
		if(first < last){
			QuickSort q = new QuickSort();
			int partition = q.partition(arr, first, last);
			q.quiSort(arr, first, partition-1);
			q.quiSort(arr, partition+1, last);
		}
		
		return arr;
	}
	
	public static void main(String[] args){
		int arr[] =  {4, 42, 7, 23, 9, 9, 10, 1, 34};
		int first = 0;
		int last = arr.length-1;
		QuickSort q = new QuickSort();
		System.out.println(Arrays.toString(q.quiSort(arr, first, last)));
	}
}
