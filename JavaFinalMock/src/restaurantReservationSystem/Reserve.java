package restaurantReservationSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Reserve {
	
	public int checkTableStatus(ArrayList<Customer> table) {
		
		int tableSize = 5;
		
		if ((int)table.size() < tableSize) {
			System.out.println("Seat is empty");
			return 1;
		}
		
		return -1;
	}

	public void addCustomer(ArrayList<Customer> table1) {
		
		Scanner sc = new Scanner(System.in);
		Customer c1 = new Customer();
		
		for(int i=1;i<5;i++)
		{
		
			System.out.print("Enter customer id: ");
			c1.setId(sc.nextInt());

			System.out.print("Enter customer Name: ");
			c1.setName(sc.next());
			table1.add(c1);
		}
		
		System.out.println("Customer on table 1 are: "+ table1);
	}

}
