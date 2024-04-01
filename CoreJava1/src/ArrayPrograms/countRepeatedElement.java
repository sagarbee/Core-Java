package ArrayPrograms;

public class countRepeatedElement {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 2, 1, 3, 3, 3, 3, 4, 8, 4, 8 };
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				/* Only taking element which are repeated */
				if (arr[i] == arr[j] && arr[j] != -1) {
					count++;

					/*
					 * Making all element which is already traverse -1 so they will not count again
					 */
					int repeatedEle = arr[j];
					for (int k = j; k < arr.length; k++) {
						if (arr[k] == repeatedEle) {
							arr[k] = -1;
						}
					}
				}
			}
		}
		/* will print element which are element more than one time */
		System.out.println(count);
	}
}
