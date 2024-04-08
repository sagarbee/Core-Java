package collectionInterrface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;

public class CollectionInterface1Driver {
	
	public static void main(String[] args) {

		Collection<CollectionInterface1> collection = new ArrayList();
		
		collection.add(new CollectionInterface1("Sagar",24,8409049147l,450000.00));
		collection.add(new CollectionInterface1("Sagar",24,8409049147l,450000.00));
		collection.add(new CollectionInterface1("Sagar",24,8409049147l,450000.00));
		collection.add(new CollectionInterface1("Sagar",24,8409049147l,450000.00));
		collection.add(new CollectionInterface1("Rakesh",26,9874549147l,780000.00));
		collection.add(new CollectionInterface1("Akash",24,7899049147l,960000.00));
		collection.add(new CollectionInterface1("Adesh",23,978549147l,780000.00));
		collection.add(new CollectionInterface1("Aditya",22,8796049147l,50000.00));
		collection.add(new CollectionInterface1("Ramesh",18,89888049147l,850000.00));
		
		//downcasted to Arraylist and sort using comparable->compareTo abstract method
		Collections.sort((ArrayList)collection);
		
		Collections.reverse((ArrayList)collection);
		
		for(CollectionInterface1 b:collection)
		{
			System.out.println(b);
		}
		
		System.out.println("REMOVING DUPLICATES");
		System.out.println("-------------------------------------------------------------");
		/*
		 * We need to override equals and hashCode method to make forEach understand what we are compare to i. salary
		 */
		System.out.println("1. using stream distinct forEach");
		collection.stream().distinct().forEach(obj->System.out.println(obj));

		System.out.println("2. using stream distinct collect");
		collection.stream().distinct().collect(Collectors.toList()).forEach(obj-> System.out.println(obj));
		
		System.out.println("3.Using set ");
		/*
		 * Overriding hashCode and equals method is must to convert set <-> list
		 */
		HashSet set = new HashSet(collection);
		/*
		 * We can't iterate over set as it does not have indexing 
		 * for(CollectionInterface1 s: (CollectionInterface1)set)
			{
			
			}
		
		 */
		
		//Convert back to list
		ArrayList<CollectionInterface1> distinctList = new ArrayList(set);
		for(CollectionInterface1 ci:distinctList)
		{
			System.out.println(ci);
		}
		
	}
}
