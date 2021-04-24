package javaOOP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Product product1 = new Product(1, "Asus", "Asus Gaming v31", 15000, 10);

		Product product2 = new Product(2,"Hp", "HP Gaming v2", 12000,3);

		Product product3 = new Product(3,"Casper", "Casper Gaming Laptop", 16000,30);
		
		Product product4 = new Product();

		Product[] products = { product1, product2, product3 };
		
		

		for (Product product : products) {
			System.out.println(product.productName);
			System.out.println(product.unitPrice);
			System.out.println(product.detail);
			System.out.println("---------------");
		}

		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Laptop";

		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Masaüstü";

		Category[] categories = { category1, category2 };

		for (Category category : categories) {
			System.out.println(category.name);
			System.out.println("-------------");
		}
		
		
		ProductManager productManager = new ProductManager();
		
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);

	}

}
