package assignment_7_Dec_2022_Factory_Design;

public class PC implements Computer {
	private String ram;
	private String hdd;
	private String cpu;
	
	private boolean isGraphicEnable;
	private boolean isBlutoothEnable;
	

	@Override
	public String toString() {
		return "PC [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + ", isGraphicEnable=" + isGraphicEnable
				+ ", isBlutoothEnable=" + isBlutoothEnable + "]";
	}

	public PC(String ram, String hdd, String cpu, boolean isGraphicEnable, boolean isBlutoothEnable) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		this.isGraphicEnable = isGraphicEnable;
		this.isBlutoothEnable = isBlutoothEnable;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getHdd() {
		return hdd;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public void setGraphicEnable(boolean isGraphicEnable) {
		this.isGraphicEnable = isGraphicEnable;
	}

	public void setBlutoothEnable(boolean isBlutoothEnable) {
		this.isBlutoothEnable = isBlutoothEnable;
	}

	@Override
	public String ram() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	@Override
	public String hdd() {
		// TODO Auto-generated method stub
		return this.hdd;
	}

	@Override
	public String cpu() {
		// TODO Auto-generated method stub
		return this.cpu;
	}

	@Override
	public boolean isGraphicEnable() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isBlutoothEnable() {
		// TODO Auto-generated method stub
		return true;
	}

}
