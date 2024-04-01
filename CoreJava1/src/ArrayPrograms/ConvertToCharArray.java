package ArrayPrograms;

import java.util.Arrays;

public class ConvertToCharArray {

	public static void main(String[] args) {

		int[] arr = { 12, 34, 56, 0, 124, 129, 122, 54, 66 };
		char[] ch = new char[arr.length];
		
		int i=0;
		for (int num : arr) {
			ch[i] = (char)num;
			i++;
		}
		
		System.out.println(Arrays.toString(ch));

	}

}
