package assignment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayTest {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(4, 8, 6, 3, 2);

		Integer integer = asList.stream().sorted().skip(1).max(Comparator.comparingInt(Integer::intValue)).get();
		System.out.println(integer);
	}
}
