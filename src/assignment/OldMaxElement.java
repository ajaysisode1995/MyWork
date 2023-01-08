package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class OldMaxElement {
	public static void main(String[] args) {
        int first=0;
        int second=0;
        int array[]= {4,8,6,3,2};
        int temp=0;;
        List<Integer> l=new ArrayList<>();
        for(Integer i:array) {
            l.add(i);
           
        }
        
       // List<Integer> asList = Arrays.asList(4,8,6,3,2);
        
       // System.out.println(l);
      //  System.out.println(asList);
       // System.out.println(l);
        Collections.sort(l);
      //  System.out.println(l);
        first=l.get(l.size()-1);
        second=l.get(l.size()-2);
       // System.out.println(l);
//        System.out.println(first);
//        System.out.println(second);
        
        
        temp=first-second;

        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        for (int i = 0; i < list.size()-1; i++) {
            if (first==array[i]) {
                list.remove(i);
                list.add(i,second);
                list.add(i+1,temp);
            }
        }
        

        System.out.println(list);
//        
    }


}
