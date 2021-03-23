package deque;

import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap <Integer,Integer> m = new TreeMap <Integer,Integer> ();
		m.put(23,546);
		m.put(12,271);
		m.put(54,125);
		m.put(34,432);
		
		System.out.println(m);
		
		
		//remove method
		
		m.remove(54);
		System.out.println(m);
		
		// desc order
		 
		System.out.println("descending order" + m.descendingKeySet());
		
		//clear method
		
	     m.clear();
	     System.out.println(m);
	     
	     
		  		
	     
	   
	}

}
