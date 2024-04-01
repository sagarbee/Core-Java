package ArrayPrograms;

public class findLength {

	public static void main(String[] args) {
		int arr[] = {1,5,8,85,42,5};
		
	
		int count=0;
		int i=0 ;

		try {
			while(true)
			{
				if(arr[i]==0 || arr[i]<=0)
				{
					break;
				}
				System.out.println(count +""+ i);
				count++;
				i++;
			}
			
		}catch(Exception e)
		{
			System.out.println(count);
		}
	}
}
