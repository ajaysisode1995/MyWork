package assignment_7_Dec_2022_BillBug_;

public class ClientTest {
	public static void main(String[] args) {
		SingleTon singleTon1 = SingleTon.getInstance();
		SingleTon singleTon2 = SingleTon.getInstance();
		System.out.println(singleTon1.hashCode());
		System.out.println(singleTon2.hashCode());
	}
}
