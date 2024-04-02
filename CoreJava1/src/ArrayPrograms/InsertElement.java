package ArrayPrograms;

import java.util.Arrays;

public class InsertElement {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		try {

			System.out.print(Arrays.toString(insertElement(arr, 7, 43)));

		} catch (NullPointerException e) {
			
		}
	}

	public static int[] insertElement(int[] arr, int index, int value) {

		if (index >= 0 && index <= arr.length) {
			int[] update = new int[arr.length + 1];
			int j = 0;
			for (int i = 0; i < update.length; i++) {
				if (i == index) {
					update[i] = value;
				} else {
					update[i] = arr[j];
					j++;
				}
			}
			return update;
		} else {
			return null;
		}
	}
}