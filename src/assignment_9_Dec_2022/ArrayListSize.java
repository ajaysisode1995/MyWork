package assignment_9_Dec_2022;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListSize {
	public static void main(String args[])
    {
        Collection<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println("This is arr " + arr);
        ArrayList<Integer> newList
            = new ArrayList<Integer>(arr);
        System.out.println("This is newList " + newList);
        newList.add(7);
        newList.add(700);
        System.out.println(
            "This is newList after adding elements "
            + newList);
    }
}
