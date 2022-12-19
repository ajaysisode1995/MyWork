package assignment_7_Dec_2022_1;

public class SingleTonDe {
	private static SingleTonDe instance=null;
	
	private SingleTonDe() {
		
	}
	
	//here we want to declare static syncronized 
	static synchronized SingleTonDe getInstance() {
		
		if (instance==null) {
			synchronized (SingleTonDe.class) {
				if (instance==null) {
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				return instance=new SingleTonDe();
			}
		  }
		}
		return instance;
	}
}
