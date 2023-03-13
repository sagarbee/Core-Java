package LinkedList;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Creating object list to access the sll class methods
		sll  list = new sll();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Singly LinkedList->  ");
		int size = sc.nextInt();
		System.out.println("No of Operation you wants to Perfrom: ");
		int k=sc.nextInt();
		for(k=0;k<6;k++) {
			System.out.println("*-----------------*****_______________________\nChoose Operation: ");
			System.out.println("1.Create Node\n"
					+ "2.Add Node First in List\n"
					+ "3.Add Node Last in List\n"
					+ "4.Delete First Element From List\n"
					+ "5.Delete Last Element From List\n"
					+ "*************************************");
		int i = sc.nextInt();	
		String data;
		switch(i)
		{
		case 1:
			System.out.println("Create Singly Linked List -> Y OR N");
			for(int j=0;j<size+1;j++) {	
			data = sc.next();
			list.addFirst(data);
			}
			break;
		case 2:
			System.out.println("Add Node First in List -> ");
			data = sc.next();
			list.addFirst(data);
			break;
			
		case 3:
			System.out.println("Add Node Last in List -> ");
			data = sc.next();
			list.addLast(data);
			break;
			
		case 4:
			System.out.println("Delete First Element From List -");
			list.deleteFirst();
			break;
			
		case 5:
			System.out.println("Delete last Element From List -");
			list.deleteLast();
			break;
			
		default:	
			break;
		}
		System.out.println("Your Final List is: ");
		 list.printList();
		}

		
	}
}
