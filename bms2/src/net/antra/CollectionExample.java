package net.antra;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionExample {

	public static void main(String[] args) {
		
		ConcurrentHashMap hm=new ConcurrentHashMap();
		hm.put(1, "manas");
		hm.put(2, "kumar");
		hm.put(3, "Che");
		hm.put(4, "tao");
		hm.put(5, "hongda");
		hm.put(6, "bo");
		Set st=hm.keySet();
		
		Iterator it=st.iterator();
		while(it.hasNext()) {
			
			System.out.println(hm.get(it.next()));
			hm.remove(1);
		}
		System.out.println(hm);
		
		/*Hashtable hm=new Hashtable();//HashTable Data structure
		hm.put(1, "manas");
		hm.put(2, "kumar");
		hm.put(3, "Che");
		hm.put(4, "tao");
		hm.put(5, "hongda");
		hm.put(6, "bo");
		hm.put(2,"binod");
		
		Set st=hm.keySet();
		
		Iterator it=st.iterator();
		while(it.hasNext()) {
			
			System.out.println(hm.get(it.next()));
		}*/
		/*TreeSet hs=new TreeSet(new Sort());
		hs.add(45);
		hs.add(12);
		hs.add(18);
		hs.add(65);
		hs.add(29);
		hs.add(34);
		hs.add(61);
		hs.add(15);
		hs.add(19);
		hs.add(41);
		hs.add(95);
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		*/
		
		/*ArrayList al=new ArrayList();
		al.add(1);
		al.add(12.3f);
		al.add(45);
		al.add(1);
		al.add("manas");
		al.add(new Student("manas",123));
		al.add(2, 96);
	
		ListIterator it=al.listIterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		
		}
		*/
		
	}

}
