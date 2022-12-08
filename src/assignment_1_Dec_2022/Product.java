package assignment_1_Dec_2022;

public class Product {

	private int productId;
	private String name;
	private double price;
	private String category;
	private String date;
		
	
	public Product(int productId, String name, double price, String category, String date) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.category = category;
		this.date = date;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", price=" + price + ", category=" + category
				+ ", date=" + date + "]";
	}


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


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public Product() {
		super();
	}
}
