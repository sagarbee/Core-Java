package rRSystem;

import java.util.Scanner;

public class Restaurant {
	private Table[] tables;

	public Restaurant(int numberOfTables) {
		tables = new Table[numberOfTables];
		for (int i = 0; i < numberOfTables; i++) {
			tables[i] = new Table(i + 1); // Table IDs start from 1
		}
	}

	 public void addCustomer() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter customer name: ");
	        String name = scanner.nextLine();

	        System.out.println("How many seats do you need?");
	        System.out.println("1. One seat");
	        System.out.println("2. Two seats");
	        System.out.println("3. Three seats");
	        System.out.println("4. Four seats");
	        System.out.println("5. Five seats");
	        System.out.print("Enter your choice: ");
	        int choice = scanner.nextInt();

	        int numOfSeats = 0;
	        switch (choice) {
	            case 1:
	                numOfSeats = 1;
	                break;
	            case 2:
	                numOfSeats = 2;
	                break;
	            case 3:
	                numOfSeats = 3;
	                break;
	            case 4:
	                numOfSeats = 4;
	                break;
	            case 5:
	                numOfSeats = 5;
	                break;
	            default:
	                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
	                return;
	        }

	        boolean seatsReserved = false;
	        for (Table table : tables) {
	            if (table.reserveSeats(new Customer(0, name), numOfSeats)) {
	                seatsReserved = true;
	                break;
	            }
	        }

	        if (!seatsReserved) {
	            System.out.println("Sorry, we couldn't reserve " + numOfSeats + " seats for you.");
	            System.out.println("Available seats at different tables:");
	            for (Table table : tables) {
	                System.out.println("Table " + table.getId() + ": " + table.getEmptySeatsCount() + " seat(s) available");
	            }
	        }
	    }

	public void displayTableStatus() {
		System.out.println("Table statuses:");
		for (Table table : tables) {
			table.displaySeatStatus();
		}
	}
 
	
	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant(20);
		restaurant.addCustomer();
        restaurant.addCustomer();
        restaurant.addCustomer();


        // Display table status
		restaurant.displayTableStatus();
	}
}
