package assignment_9_Dec_2022;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_Preference {
	public static void main(String[] args) {  
	    //LinkedList is better to manipulate data  
	    List<String> list=new LinkedList<>();  
	    list.add("ajay");  
	    list.add("vijay");  
	    list.add("sagar");  
	    System.out.println("After adding: "+list);  
	    list.remove("vijay");  
	    System.out.println("After removing: "+list);  
	    list.set(1,"vaibhav");  
	    System.out.println("After changing: "+list);  
	}  
}
