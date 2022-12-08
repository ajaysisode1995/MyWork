package assignment_23_Nov_2022;
		
		interface Interf1{
			default void m1() {
				System.out.println("default method calling from an interface");
			}
		}
public class Que8_CallDefaultmethod implements Interf1 {
	
	public static void main(String[] args) {
		Que8_CallDefaultmethod m11=new Que8_CallDefaultmethod();
		m11.m1();
		
	}
}
