package oop1;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitInStock(3);
		product1.setImageUrl("image1.jpg");
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitInStock(3);
		product2.setImageUrl("image2.jpg");
		
		Product product3= new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitInStock(3);
		product3.setImageUrl("image3.jpg");
		
		Product [ ] products = {product1, product2, product3};
		
		System.out.println("<ul>"); 
		for (Product product : products) {
				System.out.println("<li>" + product.getName() + "</li>");	
	}
		System.out.println("</ul>");	
		
		IndivudualCustomer indvidualCustomer = new IndivudualCustomer();
		indvidualCustomer.setId(1);
		indvidualCustomer.setPhone("0 555 555 55 55");
		indvidualCustomer.setCustomerNumber("12345");
		indvidualCustomer.setFirstName("ALI");
		indvidualCustomer.setLastName("YILDIZ");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setTaxNumber("1111111111");
		corporateCustomer.setCustomerNumber("54321");
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("0 555 333 33 33");
		
		Customer [ ] customers = {indvidualCustomer, corporateCustomer};
		
		for (Customer customer : customers) {
			System.out.println(customer.getPhone());
		}
		
	
	}

}
