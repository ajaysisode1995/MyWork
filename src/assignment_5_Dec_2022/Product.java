package assignment_5_Dec_2022;

public class Product {

	private int productId;
	private String name;
	private double price;
	private Integer stock;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Product(int productId, String name, double price, Integer stock) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	public Product() {
		
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", price=" + price + ", stock=" + stock + "]";
	}
	
}
