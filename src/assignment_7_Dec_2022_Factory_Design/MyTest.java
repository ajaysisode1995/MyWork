package assignment_7_Dec_2022_Factory_Design;

public class MyTest {

	public static void main(String[] args) {
		Computer pc = ComputerFatory.getComputer
				(ComputerType.PC, "2GB", "512 Hdd", "2.34Ghz", true, true);
		
		System.out.println(pc);
		
		Computer server = ComputerFatory.getComputer
				(ComputerType.Server, "4GB", "712 Hdd", "2.34Ghz", true, true);
		
		System.out.println(server);
		
		
		Computer pc1 = 
				ComputerFatory.getComputer1("PC", "2GB", "512 Hdd", "2.34Ghz", true, true);
		System.out.println(pc1);
		
		Computer sr = 
				ComputerFatory.getComputer1("Server", "2GB", "512 Hdd", "2.34Ghz", true, true);
		System.out.println(sr);
	}
}
