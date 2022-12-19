package assignment_7_Dec_Behavioral2022_StrategyDesign;

public class Product {

	private String name;
	private String upaCode;
	private int price;
	public Product(String name, String upaCode, int price) {
		super();
		this.name = name;
		this.upaCode = upaCode;
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", upaCode=" + upaCode + ", price=" + price + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUpaCode() {
		return upaCode;
	}
	public void setUpaCode(String upaCode) {
		this.upaCode = upaCode;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
