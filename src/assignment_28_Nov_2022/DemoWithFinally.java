package assignment_28_Nov_2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class DemoWithFinally {
	public static void main(String[] args) {
		File file=new File("C:\\Users\\Mobile Programming.DESKTOP-5VPG6JO\\Desktop\\Stream.txt");
		try (FileReader fReader = new FileReader(file)) {
			try {
				int read = fReader.read();
				System.out.println(read);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("finally statement is executed");
		}
		
	}
}
