package ArrayPrograms;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };

		int[] reverse = reverseArray1(arr);

		System.out.println(Arrays.toString(reverse));

		int[] reverse1 = reverseArray2(arr);

		System.out.println(Arrays.toString(reverse1));
		
		int[] revA1 = rev(arr);

		System.out.println(Arrays.toString(revA1));
	}

	public static int[] reverseArray1(int[] arr) {

		int[] reverseArray = new int[arr.length];
		int i, j;

		for (i = 0, j = arr.length - 1; i < arr.length && j >= 0; i++, j--) {
			reverseArray[i] = arr[j];
		}

		return reverseArray;
	}

	public static int[] reverseArray2(int[] arr) {
		int[] reverseArray = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			reverseArray[i] = arr[arr.length - i - 1];
		}

		return reverseArray;
	}

	public static int[] rev(int[] arr) {
		int [] revA = new int[arr.length];
		int i=0;
		for(int j = arr.length-1;j>=0;j--)
		{
			revA[i] = arr[j];
			
			i++;
		}
		return revA;
	}
}
