package assignment_7_Dec_2022_clonnig;

public class SingleTon implements Cloneable{
	private static  SingleTon instance=null;
	private SingleTon() {
		
	}
	public static SingleTon getInstance() {
		if (instance==null) {
			return instance=new SingleTon();
		}
		return instance;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("you can clone single objects");
	}
}
