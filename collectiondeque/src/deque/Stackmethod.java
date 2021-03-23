package deque;

import java.util.Stack;

public class Stackmethod {

	public static void main(String[] args) { 
		
		//push method
		Stack<String> s = new Stack<String> ();
		s.push("ragul");
		s.push("vijay");
		s.push("ajith");
		s.push("som");
		s.push("rajini");
		System.out.println(s);
        
		//pop method
		
		s.pop();
		System.out.println(s);
		
		// search method 
		
		int pos = s.search("vijay");
		System.out.println(pos);
		
		//empty method
		
        boolean empty = s.empty();
        System.out.println(empty);
        
        //capacity
        System.out.println(s.capacity());
        
        //Size 
        System.out.println(s.size());
        
        //equals method
        Stack<String> s1 = new Stack<String> ();
		s1.push("ragul");
		s1.push("vijay");
		s1.push("ajith");
		s1.push("som");
		s1.push("rajini");
		System.out.println(s1);
        
        Stack<String> s2 = new Stack<String> ();
		s2.push("ragul");
		s2.push("vijay");
		s2.push("ajith");
		s2.push("som");
		s2.push("rajini");
		System.out.println(s2);
		
		 System.out.println(s1.equals(s2)); 
                 
		//contains method
		
		 System.out.println(s2.contains("raja"));
		 
		
	}

}

