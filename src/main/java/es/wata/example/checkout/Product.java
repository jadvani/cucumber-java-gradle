/***
Created by Javier Advani
on May 30, 2018
***/
package es.wata.example.checkout;

public class Product {

	private final String productName;
	private double price;

	public Product(String productName, double price) {

		this.productName = productName;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
