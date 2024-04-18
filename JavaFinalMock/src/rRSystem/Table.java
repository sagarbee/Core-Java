package rRSystem;

import java.util.ArrayList;

public class Table {

	private int id;
	private static final int tableSize = 5;
	private ArrayList<Customer> seats;
	
	public Table(int id) {
		this.id = id;
		seats = new ArrayList<Customer>();
	}

	public int getId() {
		return id;
	}



	public boolean hasEmptySeat()
	{
		return seats.size()<tableSize;
	}
	
	 public boolean reserveSeats(Customer customer, int numOfSeats) {
	        if (hasEmptySeat() && numOfSeats <= tableSize - seats.size()) {
	            for (int i = 0; i < numOfSeats; i++) {
	                seats.add(customer);
	            }
	            System.out.println(numOfSeats + " seat(s) reserved for " + customer.getName() + " at Table " + id);
	            return true;
	        } else {
	            return false;
	        }
	    }
	
	public void displaySeatStatus()
	{
		System.out.print("Table "+id+" :");
		for(int i=0;i<tableSize;i++)
		{
			if(i<seats.size())
			{
				System.out.println("Seat "+(i+1)+": Occupied");
			}else {
				System.out.println("Seat "+(i+1)+": Empty");
			}
		}
	}
	
	public int getEmptySeatsCount() {
        return tableSize - seats.size();
    }

}
