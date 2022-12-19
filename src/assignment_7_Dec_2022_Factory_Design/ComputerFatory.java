package assignment_7_Dec_2022_Factory_Design;

public class ComputerFatory {

	private ComputerFatory() {
		
	}
	public static Computer getComputer(ComputerType computerType,String ram,String hdd,String cpu,
			boolean isGraphicEnable,boolean isBluetoothEnable) {
		switch (computerType)
		{
		case Server: {
			return new PC(ram, hdd, cpu, isGraphicEnable, isBluetoothEnable);
		}
		case PC:{
			return new Server(ram, hdd, cpu, isGraphicEnable, isBluetoothEnable);
		}
		case Laptop:{
			return new Laptop(ram, hdd, cpu, isGraphicEnable, isBluetoothEnable);
		}
		default:
			throw new RuntimeException("Invalid Object: " );
		}
	}
}
