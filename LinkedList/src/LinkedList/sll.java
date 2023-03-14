package LinkedList;

public class sll {

	Node head;
	
	class Node
	{
		public String data;
		public Node next;
		
		
	Node(String data)
	{
		this.data=data;
		this.next=null;
	}
	
	}
	//Add First Node in Link list
	public void addFirst(String data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			sll list = new sll();
			System.out.println("Enter Nodes: \n");
			head = newNode;
			newNode = head;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	//Add Last Node in Link list
	public void addLast(String data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			System.out.println("New Node creating");
			head = newNode;
			return;
		}
		Node currNode = head;
		while(currNode.next != null)
		{
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}
	//Delete First Node
	public void deleteFirst()
	{
		if(head == null)
		{
			System.out.println("List is Empty");
			return;
		}
		head = head.next;
	}
	//Deleting Last Node from List
	public void deleteLast()
	{
		if(head == null)
		{
			System.out.println("List is Empty");
			return;
		}
		if(head.next == null)
		{
			head = null;
		}
		Node finalNode = head.next;
		Node secondLast = head;
		while(finalNode.next != null)
		{
			finalNode = finalNode.next;
			secondLast = secondLast.next;
		}
		
		secondLast.next = null;
	}
	//Method for Printing the List
	public void printList()
	{
		if(head == null)
		{
			System.out.println("List is Empty");
			return;
		}
		Node currNode = head;
		while(currNode.next != null)
		{
			System.out.print(currNode.data + "->");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}
}