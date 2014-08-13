package com.mohanraj.sort;

import java.util.Arrays;

public class MergeSort {
	
	public int[] merge(int[] arr, int first, int mid, int last){
		int[] arr1 = new int[mid-first+1];
		int[] arr2 = new int[last-mid];
		int i = 0;
		int j = 0;
		int k = first;
		
		for(int m = 0; m<mid-first+1; m++){
			arr1[m] = arr[first+m];
		}
		
		for(int m = 0; m<last-mid; m++){
			arr2[m] = arr[mid+1+m];
		}
		
		/* Merge the temp arrays back into arr[l..r]*/
		while(i <= arr1.length-1 && j <= arr2.length-1){
			if(arr1[i] < arr2[j]){
				arr[k] = arr1[i];
				k++;
				i++;
			}
			else{
				arr[k] = arr2[j];
				k++;
				j++;
			}
		}
		
		/* Copy the remaining elements of L[], if there are any */
		if(i < arr1.length){
			for(; i<arr1.length; i++){
				arr[k] = arr1[i];
				k++;
				i++;
			}
		}
		
		/* Copy the remaining elements of R[], if there are any */
		if(j < arr2.length){
			for(; j<arr2.length; i++){
				arr[k] = arr2[j];
				k++;
				j++;
			}
		}
		
		return arr;
	}
	
	public int[] merSort(int[] arr, int first, int last){

		if(first < last){
			int mid = (first + last)/2;
			MergeSort m = new MergeSort();
			m.merSort(arr, first, mid);
			m.merSort(arr, mid+1, last);
			m.merge(arr, first, mid, last);
		}
		return arr;
	}
	
	public static void main(String[] args){
		int arr[] =  {4, 42, 7, 23, 9, 9, 10, 1, 34};
		int first = 0;
		int last = arr.length-1;
		MergeSort m = new MergeSort();
		System.out.println(Arrays.toString(m.merSort(arr, first, last)));
	}
}
