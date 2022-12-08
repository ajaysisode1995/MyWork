package assignment_28_Nov_2022;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FinallyDemo {
	public static void main(String[] args) {
		File file=new File("C:\\Users\\Mobile Programming.DESKTOP-5VPG6JO\\Desktop\\Stream.txt");
		try {
			FileReader fReader=new FileReader(file);
			BufferedReader bReader=new BufferedReader(fReader);
			try {
				
		while (bReader.readLine().lines()!=null)
		{
			try {
				String readLine = bReader.readLine();
				System.out.println(readLine);
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			   }
				try {
					if (bReader.lines()==null)
					{
						System.out.println();
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			  }	
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			finally {
				try {
					bReader.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
			}
				}
			
		} 
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
