package ArrayPrograms;

public class findLength {

	public static void main(String[] args) {
		int arr[] = new int[10];
		
	
		int count=0;
		int i=0 ;

		try {
			while(true)
			{
				if(arr[i]==0 || arr[i]<=0)
				{
					count++;
				}
				i++;
			}
			
		}catch(Exception e)
		{
			System.out.println(count);
		}
	}
}
