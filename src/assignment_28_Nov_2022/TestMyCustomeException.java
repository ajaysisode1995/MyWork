package assignment_28_Nov_2022;

	class CustomException extends Exception{
		
	}
	public class TestMyCustomeException {
		public static void main(String[] args) {
			try {
				
				throw new CustomException();
			} catch (CustomException e) {
				System.out.println("Caught the exception");
				System.out.println(e.getMessage());
			}
			System.out.println("code is properly ");
		}
 }
