package assignment_5_Dec_2022;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	 List<Product> cartItems=new ArrayList<>();
	 
	 public void addProductToCartById(int productId) {
		 Product product=getProductByProductId(productId);
		 addToCart(product);
	 }
	 public Product getProductByProductId(int productId) {
		Product product=null;
		
		//the catch is here that we get the attribute from Product to Products
		
		System.out.println("******************************************");
		
		List<Product> products=new Products().getProducts();
		
		for (Product prod: products) {
            if (prod.getProductId() == productId) {
                product = prod;
                break;
            }
        }
        return product;
	}
	 	
		public void addToCart(Product product) {
			cartItems.add(product);
		}
		
		public void removeProductByProductId(int productId) {
			Product product = getProductByProductId(productId);
			cartItems.add(product);
		}
		
		void printCartItems() {
			for(Product pro:cartItems) {
				System.out.println(pro.getName());
			}
		}
		
		
		
}
