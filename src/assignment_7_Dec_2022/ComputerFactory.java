package assignment_7_Dec_2022;

public class ComputerFactory {

	private ComputerFactory() {
		
	}
	
	public static Computer getFactory(AbstractComputerFactory abstractComputerFactory) {
		
		
		 
		return abstractComputerFactory.createComputer();
		
	}
	
}
