package ArrayPrograms;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		int[] rotateArrayLeft = rotateLeft(arr, 2);
		System.out.println(Arrays.toString(rotateArrayLeft));
		
		int[] rotateArrayRight = rotateLeft(arr1, 2);
		System.out.println(Arrays.toString(rotateArrayRight));
		
	}

	
	
	public static int[] rotateRight(int[] arr, int rotate) {
		for (int i = 0; i < rotate; i++) {
			int temp = arr[0];
			for (int j = 0; j < arr.length; j++) {
				arr[j+1] = arr[j];
			}
			arr[arr.length-1] = temp;
		}
		return arr;
	}
	
	
	public static int[] rotateLeft(int[] arr, int rotate) {
		for (int i = 0; i < rotate; i++) {
			int temp = arr[0];
			for (int j = 0; j<arr.length-1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length-1] = temp;
		}
		return arr;
	}
}
