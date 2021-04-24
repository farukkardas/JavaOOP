package javaOOP;

public class Product {

	// constructor overloading

	public Product() {
		System.out.println();
		System.out.println("Ben bir parametresiz  bir constructorum.");
		System.out.println();
	}

	// constructor overloading
	public Product(int id, String productName, String detail, int unitPrice, int unitsInStock) {
		this();
		this.id = id;
		this.productName = productName;
		this.detail = detail;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
	}

	int id;
	String productName;
	String detail;
	double unitPrice;
	int unitsInStock;

}
