package assignment_23_Nov_2022;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Que_1_FindLowestN_In_List {

	public static void main(String[] args) {
		    List<Integer> asList = Arrays.asList(2,5,3,4,1,5,6);
		    
		    int min_value = asList.stream().mapToInt(x->x).min().orElse(Integer.MAX_VALUE);
		    System.out.println(min_value);
		    System.out.println("\n");
		    
		    Integer integer = asList.stream().min(Comparator.naturalOrder()).get();
		    System.out.println(integer);
		    System.out.println("\n");
		    
		    Integer integer2 = asList.stream().min(Integer::compareTo).get();
		    System.out.println(integer2);
		    System.out.println("\n");
		    
		    Integer integer3 = asList.stream().reduce(Integer::min).get();
		    System.out.println(integer3);
		    System.out.println("\n");
		    
		    Integer reduce = asList.stream().reduce(Integer.MAX_VALUE,Integer::min);
		    System.out.println(reduce);
		    System.out.println("\n");
		    
		    Integer integer4 = asList.stream().collect(Collectors.minBy(Comparator.naturalOrder())).get();
		    System.out.println(integer4);
		    System.out.println("\n");
		    
		    Integer integer5 = asList.stream()
            .collect(Collectors.reducing(Integer::min))
            .get();
		    System.out.println(integer5);
		    System.out.println("\n");
		    
		    Integer integer6 = asList.stream().sorted().findFirst().get();
		    System.out.println(integer6);
		    System.out.println("\n");
		    
		    int m1 = m1(asList);
		    System.out.println(m1);
	}
	public static int m1(List<Integer> list) 
	{
		if (list == null || list.size() == 0) {
		    return Integer.MIN_VALUE;
		}
		return 0;
	}
}
