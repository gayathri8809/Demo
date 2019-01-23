package practice_Java;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String car="Honda-CRV";
		String[] vehicles={"bus","auto","bike","car","truck","van"};
		
		vehicles[1]="bicycle";
		vehicles.hashCode();
		Arrays.sort(vehicles);
		 ArrayList<String> alist=new ArrayList<String>();  
	      alist.add("Steve");
	      alist.add("Tim");
	      alist.add("Lucy");
	      alist.add("Pat");
	      alist.add("Angela");
	      alist.add("Tom");
	      alist.sort(null);
	  
	      //displaying elements
	      System.out.println(alist);
	  
	      //Adding "Steve" at the fourth position
	      alist.add(3, "Steve");
	  
	      //displaying elements
	      System.out.println(Arrays.toString(vehicles));
	      
	      String s1 = "java rules"; 
	      String s0 = "java rules"; 
	        s1=""; 
	 String s2="java rules";
	        // Yes, s1 still refers to "java" 
	 if(s1==s2)
	        System.out.println("s1 refers to " + s1 + s2); 
	}

}
