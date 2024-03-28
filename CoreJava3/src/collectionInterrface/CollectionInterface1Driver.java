package collectionInterrface;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterface1Driver {
	
	public static void main(String[] args) {

		Collection collection = new ArrayList();
		
		collection.add(new CollectionInterface1("Sagar",24,8409049147l,450000.00));
		collection.add(new CollectionInterface1("Rakesh",26,9874549147l,780000.00));
		collection.add(new CollectionInterface1("Akash",24,7899049147l,960000.00));
		collection.add(new CollectionInterface1("Adesh",23,978549147l,780000.00));
		collection.add(new CollectionInterface1("Aditya",22,8796049147l,50000.00));
		collection.add(new CollectionInterface1("Ramesh",18,89888049147l,850000.00));
		
	}
}
