package assignment_28_Nov_2022;

	class NoEmpFoundException extends Exception{

		public NoEmpFoundException(String message) {
			super(message);
			
		}
		
	}
public class Test2 {
	 private String getName(int id) throws NoEmpFoundException {
	        if (id == 100) {
	            return "Raju";
	        } else if (id == 101) {
	            return "Rani";
	        } else {
	            throw new NoEmpFoundException("Invalid Id");
	        }
	    }

	    public static void main(String[] args) {
	    	
	        Test2 d = new Test2();
	        String name;
			try {
				name = d.getName(103);
				System.out.println(name);
			} catch (NoEmpFoundException e) {
				System.out.println(e.getMessage());
			}
	       
	    }
}
