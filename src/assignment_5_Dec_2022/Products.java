package assignment_5_Dec_2022;

import java.util.ArrayList;
import java.util.List;

public class Products {

	private final List<Product> products=new ArrayList<>();
	
	public Products() {
		this.AllItems();
	}
	public List<Product> getProducts() {
		return products;
	}
	
	private void AllItems() {
		String[] productNames= {"samsung","oppo","realme","apple"};
		double[] productPrice= {43622.2,2324.44,8954.34,89433.23};
		int[] productQuantity= {12,34,7,998};
		
for (int i = 0; i < productNames.length; i++) {
	this.products.add(new Product(i+1, productNames[i], productPrice[i], productQuantity[i]));
}
	}

	
}
