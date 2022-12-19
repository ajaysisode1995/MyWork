package assignment_7_Dec_Behavioral2022_StrategyDesign;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	 List<Product> list=new ArrayList<>();

	public ShoppingCart(List<Product> list) {
		
		this.list = list;
	}
	 
	public ShoppingCart() {
		
	}

	public void addProduct(Product product) {
		list.add(product);
	}
	
	public void removeProduct(Product product) {
		list.remove(product);
	}
	
	public int calculatePriceSum() {
		return list.stream().map(a->a.getPrice()).reduce(0, Integer::sum);
		
	}
	
	public void payment(PaymentMethod paymentMethod) {
		paymentMethod.pay(calculatePriceSum());
	}
}
