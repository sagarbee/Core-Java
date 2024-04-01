package ArrayPrograms;

public class IsPalindrome {

	public static void main(String[] args) {

		int [] arr = {1,2,3,3,2,1};
		if(isPalindrome(arr))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

	public static boolean isPalindrome(int[] arr) {

		for (int i = 0, j = arr.length - 1; i<j; i++, j--) {
			if(arr[i]!=arr[j])
			{
				return false;
			}
			
		}
	return true;
	}
}
