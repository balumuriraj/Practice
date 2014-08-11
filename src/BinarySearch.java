
public class BinarySearch {
	
	public int search(int arr[], int first, int last, int find) {
		
		while(first <= last){
			int mid = (first + last)/2;
			
			if(arr[mid] == find)
				return mid;
			
			if(arr[mid] < find)
				first = mid + 1;
			else
				last = mid-1;			
			
		}
		return -1;
	}
	
	public int recursivesearch(int arr[], int first, int last, int find) {
		
		if(first <= last){
			int mid = (first + last)/2;
			
			if(arr[mid] == find)
				return mid;
			if(arr[mid] < find)
				return recursivesearch(arr, mid+1, last, find);
			else
				return recursivesearch(arr, first, mid-1, find);
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {1,3,5,9,32,56,89,90};
		int find = 89;
		
		int first = 0;
		int last = arr.length - 1;
		
		BinarySearch b = new BinarySearch();
		
		int result = b.search(arr, first, last, find);
		int recresult = b.recursivesearch(arr, first, last, find);
		
		System.out.println(result);
		System.out.println(recresult);
	}

}
