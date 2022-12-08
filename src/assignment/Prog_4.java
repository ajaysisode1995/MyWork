package assignment;

import java.util.Arrays;

public class Prog_4 {
	
	public static void main(String[] args) {
		int[] arr= {333,893,1948,34,2346};
		int k=3;
		String[] result = new String[arr.length];
		int index=0;
		
		for(int i=0;i<arr.length;i++) {
			char[] charArray = Integer.toString(arr[i]).toCharArray();
			String s="";
			for (int j = 0; j < charArray.length; j++) {
				if (!Integer.toString(k).equals(Character.toString(charArray[j]))) {
					s=s+charArray[j];
				}
		}
			s=result[index];
	 }
		System.out.println(Arrays.toString(result));
	}
}