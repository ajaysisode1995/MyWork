package assignment_7_Dec_2022_clonnig;



public class ClientTest {
	public static void main(String[] args) throws CloneNotSupportedException  {
		SingleTon singleTon1 = SingleTon.getInstance();
		SingleTon singleTon2=(SingleTon) singleTon1.clone();
		
		System.out.println(singleTon1.hashCode());
		System.out.println(singleTon2.hashCode());
	}
}

