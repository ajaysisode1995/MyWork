package assignment;

public class PatternTest {
	
	public static void main(String[] args) {
		
		int i,j,min;
		int n=4;
		
		for( i=1;i<=n;i++) {
			for( j=1;j<=n;j++) {
				min=i<j?i:j;
				System.out.print(n-min+ 1+ " ");
			}
			for(j=n-1;j>=1;j--) {
				min=i<j?i:j;
				System.out.print(n-min+ 1+ " ");
			}
			System.out.println();
		}
		
				for( i=n-1;i>=1;i--) {
					for( j=1;j<=n;j++) {
						min=i<j?i:j;
						System.out.print(n-min+ 1+ " ");
					}
//					for(j=n-1;j>=1;j--) {
//						min=i<j?i:j;
//						System.out.print(n-min+ 1+ " ");
//					}
					System.out.println();
				}
	}
}
