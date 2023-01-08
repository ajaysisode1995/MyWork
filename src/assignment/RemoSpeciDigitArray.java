package assignment;

public class RemoSpeciDigitArray {
	public static void main(String[] args) {
		int[] arr= {333,893,1948,34,234};
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=removeDigit(arr[i]);
		}
		
		for(Integer q:arr) {
			System.out.print(q+" ");
		}
		
	}

	private static int removeDigit(int i) {
		String s = Integer.toString(i);
		String d="";
		
		for (int j = 0; j < s.length(); j++) {
			
			if (s.charAt(j)=='3') {
				continue;
			}
			d=d+s.charAt(j);
		}
		
		if (d.isEmpty()) {
			return 0;
		}
		return Integer.parseInt(d);
	}
}
