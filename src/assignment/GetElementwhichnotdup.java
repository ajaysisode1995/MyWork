package assignment;

import java.util.HashSet;

public class GetElementwhichnotdup {
	
	static int findrepeatingElement(int[] ar,int n) {
		HashSet<Integer> set=new HashSet<>();
		for (int i = 0; i < n; i++) {
			int count=0;
			if (set.contains(ar[i])) {
				count++;
				
				return ar[i];
			}
			set.add(ar[i]);
		}
		return -1;
		
	}
	public static void main(String[] args) {
		
		int[] ar1= {10,20,10,30,20,50};
		int n = ar1.length;
		System.out.println(findrepeatingElement(ar1, n));
		
		
		
		
	}
}
