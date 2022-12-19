package assignment_7_Dec_2022;

public class LaptopFactory implements AbstractComputerFactory {
	private String ram;
	private String hdd;
	private String cpu;
	private boolean isGraphicEnable;
	private boolean isBlutoothEnable;
	
	public LaptopFactory(String ram, String hdd, String cpu, boolean isGraphicEnable, boolean isBlutoothEnable) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		this.isGraphicEnable = isGraphicEnable;
		this.isBlutoothEnable = isBlutoothEnable;
	}

	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new Laptop(ram, hdd, cpu, isGraphicEnable, isBlutoothEnable);
	}

}
