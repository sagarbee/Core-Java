package ArrayPrograms;

public class sumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,34,5,4,5,6,57,5,57};
		System.out.println(sumOfElements(arr));;
		
	}

	public static int sumOfElements(int[] arr) {
		int sum = 0;
		for (int n : arr) {
			sum += n;
		}

		return sum;
	}
}
