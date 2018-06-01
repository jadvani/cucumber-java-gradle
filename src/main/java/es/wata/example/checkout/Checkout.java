/***
Created by Javier Advani
on May 30, 2018
***/
package es.wata.example.checkout;

import java.util.ArrayList;
import java.util.List;

public class Checkout {

	private List<Product> products = new ArrayList<>();

	public void add(int quantity, Product product) {
		for (int i = 0; i < quantity; i++) {
			products.add(product);
		}
	}

	public double calculateTotalPrice() {
		return products.stream().mapToDouble(x -> x.getPrice()).sum();
	}

}
