package assignment_1_Dec_2022;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestCondition {
  
  static List<Product> products=new ArrayList<>();
 
	public static void main(String[] args) {
		products.add(new Product(10, "TOM", 120, "Books","01-Feb-2021"));
		products.add(new Product(11, "dolls", 100, "Toys","02-Apr-2021"));
		products.add(new Product(12, "DSA", 130, "Books","01-Feb-2021"));
		products.add(new Product(13, "magic cube", 120, "Toys","03-Apr-2021"));
		products.add(new Product(14, "Law of Attarction", 90, "Books","01-Feb-2021"));
		products.add(new Product(15, "barbei", 111, "Baby","01-Apr-2021"));
		products.add(new Product(16, "small_doll", 112, "Baby","01-Dec-2021"));
		
	
		//-Obtain a list of products belongs to category “Books” with price > 100
		System.out.println("\n");
		m1();
		System.out.println("\n");
		
		//-Obtain a list of order with products belong to category “Baby”
		m2();
		System.out.println("\n");
		
		//-Obtain a list of product with category = “Toys” and then apply 10% discount
		m3();
		System.out.println("\n");
		
		//-Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021
		m4();
		System.out.println("\n");
		// -Get the cheapest products of “Books” category
		m5();
	}
	private static void m1() {
		List<Product> collect = products.stream().filter(x->{
			if ((x.getPrice()>100) && x.getCategory().equals("Books")) {
				System.out.println(x.getName()+":"+x.getCategory()+":"+x.getPrice());
				return true;
			}
			return false;
		}).collect(Collectors.toList());
		collect.forEach(x->System.out.println(x));
	}
	private static void m2() {
		products.stream().filter(x->x.getCategory().equals("Baby")).collect(Collectors.toList()).forEach(x->System.out.println(x));
		
	}
	
	private static void m3() {
		products.stream().filter(x->{
			if (x.getCategory().equals("Toys")) {
				System.out.println(x.getName()+":"+x.getCategory()+""+x.getPrice()*0.90);
				return true;
			}
			else {
				return false;
			}
			
		}).forEach(x->System.out.println(x));;
		
	}

	private static void m4() {
		 products.stream().filter(x->{
			if ((x.getDate().equals("01-Feb-2021")) && (x.getDate().equals("01-Apr-2021")) ) {
				System.out.println(x.getName()+":"+x.getDate()+":"+x.getCategory()+":"+x.getPrice());
				return true;
			}
			else {
				return false;
			}
		});
	}
	private static void m5() {
		Optional<Product> findFirst = products.stream()

        .filter(p -> p.getCategory().equalsIgnoreCase("Books"))

        .sorted(Comparator.comparing(Product::getPrice))

        .findFirst();
		System.out.println(findFirst);
		
	}
}
