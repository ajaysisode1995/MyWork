package assignment_9_Dec_2022;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Preference {
	public static void main(String[] args) {  
	    //ArrayList is better to store and view data  
	    List<String> list=new ArrayList<>();  
	    list.add("ajay");  
	    list.add("sisode");  
	    list.add("mayank");  
	      
	    System.out.println("Traversing ArrayList...");  
	    for(String s:list){  
	        System.out.println(s);  
	    }  
	}  
}
