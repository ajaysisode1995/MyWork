package assignment_7_Dec_2022;



public class ClientTest {
	public static void main(String[] args) {
		/**
		 * here I created Computer factory with other 
		 * three factory in the name of 
		 * LaptopFactory
		 * PCFactory
		 * ServerFactory
		 */
		System.out.println("Laptop instance is created by using LaptopFactory");
		Computer laptop = ComputerFactory.getFactory
		(new LaptopFactory("8GB", "512 HDD","2.4Hz", true, true));
		System.out.println(laptop);
		
		System.out.println("\n");
		
		System.out.println("pc instance is created by using PCFactory");
		Computer pc = ComputerFactory.getFactory
		(new PCFactory("12GB", "715 HDD","12.4Hz", true, true));
		System.out.println(pc);
		
		System.out.println("\n");
		
		System.out.println("Server instance is created by using ServerFactory");
		Computer server = ComputerFactory.getFactory
		(new ServerFactory("12GB", "715 HDD","12.4Hz", true, true));
		System.out.println(server);

	}
}
