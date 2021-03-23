package deque;

import java.util.Vector;

public class Vectormethod {

	public static void main(String[] args) {
		 
       Vector <String> v = new   Vector <String>();
       v.add("lion");
       v.add("dog");
       v.add("tiger");
       v.add("giraffe");
       v.add("camel");
       v.addElement("bat");
       System.out.println(v);
       
       //capacity
       System.out.println(v.capacity());
       
       //size
       System.out.println(v.size());
       
       //firstelement
       System.out.println(v.firstElement());
       
       //lastelement
       System.out.println(v.lastElement());
      
       //clone
       v.clone();
       System.out.println(v);
       
       //contains 
       System.out.println(v.contains("camel"));
       
       //empty
       System.out.println(v.isEmpty());
       
       //index 
       System.out.println(v.indexOf("bat"));
       
       //insert elemenet
       v.insertElementAt("peacock",4);
       System.out.println(v);
       
       //addall
       Vector <String> v1 = new   Vector <String>();
       v1.add("lion");
       v1.add("dog");
       v1.add("tiger");
       v1.add("giraffe");
       v1.add("camel");
       v1.addElement("bat");
       
       Vector <String> v2 = new   Vector <String>();
       v2.add("ss");
       v2.add("aa");
       v2.add("hg");
       v2.add("eryt");
       v2.add("sst");
       v2.addElement("et");
       
       v1.addAll(v2);
	   System.out.println(v1);
	   
	   //contain
	   System.out.println(v2.contains("tiger"));
	   
	   //clear
       v2.clear();
       System.out.println(v2);
       
}
}