package assignment_7_Dec_2022_Factory_Design;

public interface Computer {

	public abstract String ram();
	public abstract String hdd();
	public abstract String cpu();
	
	public boolean isGraphicEnable();
	public boolean isBlutoothEnable();
}
