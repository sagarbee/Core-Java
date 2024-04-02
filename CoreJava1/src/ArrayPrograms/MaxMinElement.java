package ArrayPrograms;

public class MaxMinElement {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 1, 65, 23, 2, 43 };

		System.out.println("MIN : "+min(arr));
		System.out.println("MAX : "+max(arr));
	}

	public static int min(int[] arr) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
			}

		}
		return min;
	}
	
	public static int max(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}

		}
		return max;
	}
}
