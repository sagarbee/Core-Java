package ArrayPrograms;

import java.util.Arrays;

public class ZigZagArray {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] arr2 = { 8, 9, 10 };

		int[] zigZag = new int[arr1.length + arr2.length];

		System.out.println(Arrays.toString(zigZagArray(arr1,arr2,zigZag)));
	}

	public static int[] zigZagArray(int[] arr1, int[] arr2, int[] zigZag) {

		int i,j,k;
		for(i=0,j=0,k=0;i<arr1.length || j<arr2.length;)
		{
			if(i<arr1.length)
			{
				zigZag[k++]=arr1[i++];
			}
			if(j<arr2.length)
			{
				zigZag[k++] = arr2[j++];
			}
		}
		return zigZag;
	}

}
