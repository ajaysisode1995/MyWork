package assignment_23_Nov_2022;

import java.util.Random;

public class Que6_PrintRandom10withLength5 {
//  How Will You Print 10 Random Numbers In A Sorted Order In Java 8?
	public static void main(String[] args) {
		Random r=new Random();
		r.ints().limit(10).sequential().sorted().forEach(System.out::println);
	}
}
