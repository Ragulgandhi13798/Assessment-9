package deque;

import java.util.ArrayDeque;


public class Dequeexample {

	public static void main(String[] args) {
		 ArrayDeque<String> dq 
         = new ArrayDeque<String>(); 

    //add element
		 
     dq.add("vjiay"); 
     dq.add("ragul"); 
     dq.add("ajith"); 

     System.out.println(dq); 
		
    //offerfirst
     
     dq.offerFirst("king");
     System.out.println(dq);
     
     //poll method
     
     dq.poll();
     System.out.println(dq);
     
     //poll last
     dq.pollLast();
     System.out.println(dq);
     
     //offerlast
     dq.offerLast("raja");
     System.out.println(dq);
     
     //remove method
     
     dq.remove("ragul");
     System.out.println(dq);
     
	}

}
