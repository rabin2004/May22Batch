package javaBasics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapHashTableConcept {
	
	// HashMap & Hashtable -> class, key-value pair

	public static void main(String[] args) {
		
//		HashMap hm = new HashMap(); // non-parameterized/raw type
		HashMap<Integer,String> hm = new HashMap<Integer, String>(); // parameterized -> <Integer(key), String(value)>
		
		// insert data - value inserted will be based on hashcode generated for key
		hm.put(5, "Micheal");
		hm.put(7, "Bond");
		hm.put(9, "Simon");
		hm.put(1, "Jerry");
		
		// extract data
		System.out.println(hm.get(7));
		
		System.out.println(hm);
		
		// all keys
		Set<Integer> keys = hm.keySet();
		System.out.println(keys);
		System.out.println("Number of keys: "+keys.size());
		// traversing -> for/while loop, for each loop, iterator
		for(int a:keys) {
			System.out.println(hm.get(a));
		}
		
		// all values
		Collection<String> allValues = hm.values();
		System.out.println(allValues);
		System.out.println("Number of values: "+allValues.size());
		
		// all entries
		Set<Entry<Integer, String>> allEntries = hm.entrySet();
		System.out.println("Number of entries: "+allEntries.size());
		System.out.println(allEntries);
		
		// Handling null key-value
		hm.put(null, "Siri");
		hm.put(6, null);
		hm.put(null, null); // duplicate key -> replace value
		System.out.println(hm);
		
		
		Hashtable<Integer,String> ht = new Hashtable<Integer, String>(); // parameterized -> <Integer(key), String(value)>
		
		// insert data - value inserted will be based on hashcode generated for key
		ht.put(5, "Micheal");
		ht.put(7, "Bond");
		ht.put(9, "Simon");
		ht.put(1, "Jerry");
		
		// extract data
		System.out.println(ht.get(7));
		
		System.out.println(ht);
		
		// all keys
		Set<Integer> keysHT = ht.keySet();
		System.out.println(keysHT);
		System.out.println("Number of keys: "+keysHT.size());
		// traversing -> for/while loop, for each loop, iterator
		for(int a:keysHT) {
			System.out.println(hm.get(a));
		}
		
		// all values
		Collection<String> allValuesHT = ht.values();
		System.out.println(allValuesHT);
		System.out.println("Number of values: "+allValuesHT.size());
		
		// all entries
		Set<Entry<Integer, String>> allEntriesHT = ht.entrySet();
		System.out.println("Number of entries: "+allEntriesHT.size());
		System.out.println(allEntriesHT);

		// Handling null key-value
//		ht.put(null, "Siri"); // NullPointerException: Cannot invoke "Object.hashCode()" because "key" is null
//		ht.put(6, null); // NullPointerException
//		ht.put(null, null); // NullPointerException
		
//		HashMap<String, ArrayList<String>> hm2 = new HashMap<String,ArrayList<String>>();
	}
	
	// Assignment: Library application | Student profile lookup | Login functionality | Registration functionality

}
