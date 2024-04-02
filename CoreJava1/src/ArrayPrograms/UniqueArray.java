package ArrayPrograms;

import java.util.stream.Stream;
import java.util.Arrays;

public class UniqueArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 1, 3, 4, 5, 6, 7, 9, 8, 5 };
		System.out.println(Arrays.toString(uniqueArray(arr)));
		
		Arrays.stream(arr).distinct().forEach((num)-> System.out.print(num+" "));
	}

	public static int[] uniqueArray(int[] arr) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {

				if(arr[i]==arr[j])
				{
					arr[j]= -1;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=-1)
			{
				count++;
			}
		}
		
		int[] uniqueArray = new int[count];
		for(int i=0,j=0;i<arr.length;i++)
		{
			if(arr[i]!=-1)
			{
				uniqueArray[j++]=arr[i];
			}
		}

		return uniqueArray;
	}
}
