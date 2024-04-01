package ArrayPrograms;

import java.util.Arrays;

public class copyArray {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6};
		int [] copy = copyArray(arr);
		
		System.out.println(Arrays.toString(copy));
	}
	
	public static int [] copyArray(int arr[])
	{
		int copy[] = new int[arr.length];
		
		int i=0;
		
		for(int element: arr)
		{
			copy[i] = element;
			i++;
		}
		
		return copy;
	}

}
