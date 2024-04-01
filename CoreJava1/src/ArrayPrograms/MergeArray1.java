package ArrayPrograms;

import java.util.Arrays;

public class MergeArray1 {

	public static void main(String[] args) {

		int [] arr1 = {1,2,3,4,6,8,9,86};
		int [] arr2 = {21,3,43,5,56,77,64,3};
		
		int[] mergeArray = new int[arr1.length+arr2.length]; 
		int length = arr1.length;
		
		int i =0;
		for(int merge: arr1)
		{
			mergeArray[i] = merge;
			i++;
		}
		for(int merge:arr2)
		{
			mergeArray[i] = merge;
			i++;
		}
		
		
		System.out.println(Arrays.toString(mergeArray));
	}

}
