package rRSystem;

import java.util.ArrayList;

public class RestaurantDao {

	public int checkTableStatus(ArrayList<Customer> table)
	{
		int tableSize = 5;
		if(table.size()<tableSize)
		{
			System.out.println("Seat is empty");
			return 1;
		}
		else
		{
			System.out.println("Table is full");
		}
	}
	
}
