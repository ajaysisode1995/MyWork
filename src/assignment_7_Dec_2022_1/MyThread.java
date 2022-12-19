package assignment_7_Dec_2022_1;

public class MyThread implements Runnable{

	@Override
	public void run() {
		
		SingleTonDe singleTonDe = SingleTonDe.getInstance();
		
		System.out.println(Thread.currentThread().getName()+"::"+singleTonDe.hashCode());
	}

}
