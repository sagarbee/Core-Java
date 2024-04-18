package restaurantReservationSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restaurant {

	public static void main(String[] args) {

//		ArrayList<Customer> table1 = new ArrayList();

//		Map<Integer,String> table1 = new HashMap<Integer, String>();

		ArrayList<Customer> table1 = new ArrayList();
//		table1.add(new Customer(1,"Sagar"));
//		table1.add(new Customer(2,"Ravi"));
//		table1.add(new Customer(3,"Rakesh"));
//		table1.add(new Customer(4,"Aditya"));
//		table1.add(new Customer(5,"pranv"));
//		
//		for(Customer t1: table1)
//		{
//			System.out.println(t1);
//		}
//		
//		System.out.println(table1);

//		if(Reserve.checkTableStatus(table1))	
//		{
//			Reserve.addCustomer(table1);
//		}
//		else
//		{
//			System.out.println("Table 1 is Full");
//		}

		/*
		 * Customer added and Show details of customer in table1 succefully
		 */
		Reserve res = new Reserve();
		res.addCustomer(table1);

		res.checkTableStatus(table1);
	}

}
