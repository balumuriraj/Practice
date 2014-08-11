package com.mohanraj.sort;

import java.util.Arrays;

public class BubbleSort {
	
	public int[] bubSort(int[] arr){
		
		boolean swapped;
		
		for(int i = 0; i<arr.length-1; i++){
			swapped = false;
			
			//Last i elements are already in place  
			for(int j = 0; j<arr.length-i-1; j++){
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			
			//Stop when there is no swap
			if(swapped == false){
				break;
			}
		}
		return arr;
	}
	
	public static void main(String[] args){
		int arr[] = {4, 42, 7, 23, 9, 5, 10, 1, 34};
		BubbleSort b = new BubbleSort();
		System.out.println(Arrays.toString(b.bubSort(arr)));
	}

}
