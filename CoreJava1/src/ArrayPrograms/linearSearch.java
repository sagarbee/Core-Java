package ArrayPrograms;

import java.util.Arrays;
import java.util.stream.Stream;

public class linearSearch {

	public static void main(String[] args) {

		int[] arr = { 3, 4, 65, 34, 98, -1, 0, -332, 44, -89 };

		int findUsingFor = searchUsingFor(arr, -89);
		if (findUsingFor != -1) {
			System.out.println("Element found at position: " + findUsingFor);
		} else {
			System.out.println("Element not found");
		}

		int findUsingForEach = searchUsingForEach(arr, -1);
		if (findUsingFor != -1) {
			System.out.println("Element found at position: " + findUsingForEach);
		} else {
			System.out.println("Element not found");
		}

		int findUsingStream = searchUsingFor(arr, 65);
		if (findUsingFor != -1) {
			System.out.println("Element found at position: " + (findUsingStream + 1));
		} else {
			System.out.println("Element not found");
		}
	}

	public static int searchUsingFor(int[] arr, int search) {

		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				return i;
			}
		}

		return -1;

	}

	public static int searchUsingForEach(int[] arr, int search) {
		int position = 0;

		for (int num : arr) {
			if (num == search) {
				return position + 1;
			}
			position++;
		}

		return -1;
	}

	public static int searchUsingStream(int[] arr, int search) {
		return Arrays.stream(arr).filter(num -> num == search).findFirst().orElse(-1);

	}
}