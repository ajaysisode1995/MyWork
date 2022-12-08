package assignment_5_Dec_2022;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

	Cart cart=new Cart();
	private int ch=0;

	public UserInterface() {
		menu();
	}
	
	public void displayScreen() {
		System.out.println("1. Display Store Products");
        System.out.println("2. Display Cart");
        System.out.println("0. Exit");
	}
	
	public void storeProductsMenu() {
		System.out.println("1. Add to Cart");
        System.out.println("2. Remove From Cart");
        System.out.println("0. Exit");
	}

	public void menu() {
		do {
			displayScreen();
			getUserInput();
			
			switch (ch) {
			case 1: {
					displayStoreProducts();
					storeProductsMenu();
					getUserInput();
					innerChoice();
				break;
			}
			case 2: {
				showCart();
				break;
			}
			case 0: {
				System.exit(0);
				break;
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
		} 
		while (ch!=0);
	}
	private void innerChoice() {
		
		switch (ch) {
		case 1: {
				addProductToCart();
				showCart();
			break;
		}
		case 2: {
			removeCartFromProduct();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + ch);
		}
		
	}

	private void removeCartFromProduct() {
		int userInput = getUserInput();
		cart.removeProductByProductId(userInput);
		
	}

	private int getUserInput() throws NumberFormatException{
		System.out.println("Enter your choice");
		Scanner sc=new Scanner(System.in);
		ch=Integer.parseInt(sc.nextLine());
		return ch;
		
	}
	private void displayStoreProducts() {
		List<Product> products=new Products().getProducts();
		for(Product prod:products) {
			System.out.println(prod.getName()+":"+prod.getPrice()+":"+prod.getStock()+":"
					+prod.getProductId());
		}
		
	}
	private void showCart() {
		cart.printCartItems();
		
	}

	private void addProductToCart() {
		int userInput = getUserInput();
		cart.addProductToCartById(userInput);
		
	}
}
