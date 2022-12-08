package assignment;

public class Prog_444 {
	public static void main(String[] args) {
		int[] arr= {333,893,1948,34,2346};
		
		int k=3;
		String temp;
		String[] str=new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (String.valueOf(arr[i]).contains("3")) {
				temp=String.valueOf(arr[i]).replaceAll("3", "");
				if (!temp.equals("")) {
					str[i]=temp;
				}
				else {
					str[i]="";
				}
			}
			else {
				str[i] = String.valueOf(arr[i]);
			}
			System.out.print("[");
			
			for (int j = 0; j < arr.length; j++) {
				System.out.print(str[j]+",");
			}
			System.out.println("]");
		}
	
		
	}
}
