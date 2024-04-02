package ArrayPrograms;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int search = 15;

		System.out.println(isFound(arr, search));

		System.out.println(isFoundBoolean(arr,12));
	
	}

	public static int isFound(int[] arr, int search) {
		
		int start = 0, end = arr.length-1;
		int mid = (start+end)/2;
		
		while(start<=end)
		{
			if(search == arr[mid])
			{
				return mid;
			}
			else if(search > arr[mid])
			{
				start = mid+1;
			}
			else if(search<arr[mid])
			{
				end = end-1;
			}
			
			mid = (start+end)/2;
			if(start > end)
			{
				System.out.println("Element not found");
			}
		}
		
		return -1;
	}
	
	public static boolean isFoundBoolean(int [] arr,int search)
	{
		int start = 0; 
		int end = arr.length-1;
		int mid = (start+end)/2;
		
		while(start<=end)
		{
			if(search == arr[mid])
			{
				return true;
			}
			else if(search > arr[mid])
			{
				start = mid+1;
			}
			else if(search<arr[mid])
			{
				end = end-1;
			}
			
			mid = (start+end)/2;
			if(start > end)
			{
				System.out.println("Element not found");
			}
		}
		
		return false;
	}

}
