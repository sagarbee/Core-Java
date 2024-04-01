package ArrayPrograms;

import java.util.Arrays;

public class PositiveOnLeftNegativeOnRight {

	public static void main(String[] args) {
		int [] arr = {1,2,5,6,-6,-56,34,2,-3,-1,34,5,-4,12};
		int [] newArr = new int[arr.length];	
		int i =0;
		for(int element:arr)
		{
			if(element>=0)
			{
				newArr[i] = element;
				i++;
			}
			
		}
		int j = i;
		for(int element:arr)
		{
			if(element<0 && j<arr.length)
			{
				newArr[j] = element;
				j++;
			}
		}
		
		System.out.println(Arrays.toString(newArr));
		
	}
}
