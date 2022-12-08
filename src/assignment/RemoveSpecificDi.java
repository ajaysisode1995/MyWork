package assignment;



//333,893,1948,34,2346
public class RemoveSpecificDi {
	static int removeDigit(int a) {
		String c = Integer.toString(a);
		String d="";
		for (int i = 0; i < c.length(); i++) {
			if (c.charAt(i)== '3') {
				continue;
			}
			d=d+c.charAt(i);
		}
		if (d.isEmpty()) {
			return 0;
		}
		return Integer.parseInt(d);
		}
	public static void main(String[] args) {
		int[] a= {333,893,1948,34,234};
		
		for(int i=0;i<a.length;i++) {
			a[i]=removeDigit(a[i]);
		}
		for(int s:a) {
			System.out.print(s+" ");
		}
	}
}
