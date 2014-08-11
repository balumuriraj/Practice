import java.util.Arrays;


public class SelectionSort {
	
	public int[] selSort(int[] arr){
		int min=0;
		
		while(min!=arr.length-1){
			for(int i=min; i<arr.length; i++){
				if(arr[i] < arr[min]){
					int temp = arr[min];
					arr[min] = arr[i];
					arr[i] = temp;
				}
			}
			min++;
		}
		return arr;
	}

	public static void main(String[] args){
		int arr[] = {4, 42, 7, 23, 9, 5, 10, 1, 34};
		SelectionSort ss= new SelectionSort();
		System.out.println(Arrays.toString(ss.selSort(arr)));
	}
}
