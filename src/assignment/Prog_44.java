package assignment;

import java.util.Arrays;

public class Prog_44 {
	public static void main(String[] args) {
		int[] arr= {333,893,1948,34,2346};
		int k=3;
		String[] result = new String[arr.length];
		int index=0;
		for (int i = 0; i < result.length; i++) {
			String str="";
			char[] ch = Integer.toString(arr[i]).toCharArray();
			for (int j = 0; j < result.length; j++) {
				if (!Integer.toString(k).equals(Character.toString(ch[j]))) {
					str=str+ch[j];
				}
				str=result[index++];
			}
		}
		System.out.println(Arrays.toString(result));
	}
}
