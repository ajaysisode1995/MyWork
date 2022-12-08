package assignment;

import java.util.Arrays;
import java.util.Iterator;



public class Prog_3 {

	static int[] maxElment(int[] ar) {
		int[] b = Arrays.copyOfRange(ar, 0, ar.length-1);
		Arrays.sort(b);
		
		return result(b[b.length-1], b[b.length-2], ar);	
	}
	static int[]  result(int max,int nextMax,int[] a1)
	{
		int[] c=new int[a1.length-1];
		int number=0;
		for(int i=0;i<a1.length;i++) {
			if (a1[i]==max && number==0) {
				number++;
				c[i]=nextMax;
				c[i+number]=max-nextMax;
			}
			else {
				c[i+number]=a1[i];
			}
		}
		return c;
		}
	public static void main(String[] args) {
		int[] a= {4,8,6,3,2};
		int[] b = maxElment(a);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}
}
