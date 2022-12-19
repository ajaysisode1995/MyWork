package assignment_7_Dec_Behavioral2022_StrategyDesign;

public class PaypalPaymentMode implements PaymentMethod {
	private String email;
	private String username;
	public PaypalPaymentMode(String email, String username) {
		super();
		this.email = email;
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public void pay(int amount) {
		System.out.println(amount+" is done by by paypal mode");
		
	}
	
}
