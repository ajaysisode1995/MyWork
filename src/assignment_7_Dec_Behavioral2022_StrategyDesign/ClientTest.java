package assignment_7_Dec_Behavioral2022_StrategyDesign;

public class ClientTest {
	public static void main(String[] args) {
		ShoppingCart shoppingCart=new ShoppingCart();
		
		Product product1=new Product("flower", "ruith", 100);
		Product product2=new Product("football", "hr3o", 105);
		Product product3=new Product("watch", "ehufip", 200);
		
		shoppingCart.addProduct(product1);
		shoppingCart.addProduct(product2);
		shoppingCart.addProduct(product3);
		//proceed to payment strategy credit payment mode
		shoppingCart.payment(new CreditcardPaymentMode("ajay", "debitcart", "344", "19/26"));
				
		Product product4=new Product("shivaji", "hfeu", 1500);
		Product product5=new Product("vaibhav", "nfiu", 3000);
		
		shoppingCart.addProduct(product5);
		shoppingCart.addProduct(product4);
		
		shoppingCart.payment(new PaypalPaymentMode("ahskh", "shjfk"));
		
	}
}
