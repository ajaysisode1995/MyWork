package assignment_7_Dec_2022_1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientTest {
	
	public static void main(String[] args) {
			ExecutorService executorService=null;
			MyThread myThread=new MyThread();
			 try {
				executorService = Executors.newFixedThreadPool(10);
				executorService.execute(myThread);
				executorService.execute(myThread);
				executorService.execute(myThread);
				executorService.execute(myThread);
				executorService.execute(myThread);
				executorService.execute(myThread);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			finally {
				if (executorService!=null) {
					executorService.shutdown();
				}
			}
	}
}
