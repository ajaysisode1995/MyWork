package assignment_23_Nov_2022;

	interface Interf{
		public static void m1111() {
			System.out.println("static method in The Interface");
		}
	}

public class Que7_Call_StaticMethodInClass {

	public static void main(String[] args) {
		//here i can directly call with functional interface
		Interf.m1111();
	}
}
