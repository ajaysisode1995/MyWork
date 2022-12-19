package assignment_7_Dec_2022_BillBug_;



public class SingleTon {

	private SingleTon() {
		
	}
	
	private static class SingleToneHolder{
		private static final SingleTon instance=new SingleTon();
	}
	
	public static SingleTon getInstance() {
		return SingleToneHolder.instance;
		
	}
}
