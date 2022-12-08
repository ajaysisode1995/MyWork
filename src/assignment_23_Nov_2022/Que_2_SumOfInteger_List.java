package assignment_23_Nov_2022;

import java.util.Arrays;
import java.util.List;

public class Que_2_SumOfInteger_List {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(30,20,40,10);
		
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		System.out.println("\n");
		
		int sum2 = list.stream().mapToInt(Integer::valueOf).sum();
		System.out.println(sum2);
		System.out.println("\n");
		
		int sum3 = list.stream().mapToInt(x->x).sum();
		System.out.println(sum3);
		System.out.println("\n");
		
		Integer integer = list.stream().reduce((x,y)->x+y).get();
		System.out.println(integer);
		System.out.println("\n");
		
		Integer integer2 = list.stream().reduce(Integer::sum).get();
		System.out.println(integer2);
		System.out.println("\n");
		
		Integer reduce = list.stream().reduce(0, Integer::sum);
		System.out.println(reduce);
		System.out.println("\n");
		
		 long sum4 = list.stream().mapToInt(Integer::valueOf).summaryStatistics().getSum();
		System.out.println(sum4);
		System.out.println("\n");
		
		sumofList(list);
	}
//simple solution
	private static int sumofList(List<Integer> list) {
		int sum=0;
		for(Integer l:list) {
			sum+=l;
		}
		return sum;
	}
}
