package ArrayPrograms;

import java.util.Arrays;

public class SwapElement {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };

		System.out.println(Arrays.toString(swapPairs(arr)));
	}

	public static int[] swapPairs(int[] arr) {
		int start = 0;
		int end = arr.length;
		while(start<end)
		{
			arr[start] = arr[start]+arr[start+1];
			arr[start+1]=arr[start]-arr[start+1];
			arr[start] =arr[start]-arr[start+1];
			start+=2;
		}
		
		return arr;
	}
}
