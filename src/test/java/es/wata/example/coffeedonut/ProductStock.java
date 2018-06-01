/***
Created by Javier Advani
on Jun 1, 2018
***/
package es.wata.example.coffeedonut;

import java.util.Map;

public class ProductStock {
	Map<String, Double> stuff;

	public ProductStock(Map<String, Double> stuff) {
		this.stuff = stuff;
	}

	public double calculatePrice(int[] quantities) {
		double result = 0;
		int i = 0;

		for (Map.Entry<String, Double> entry : stuff.entrySet()) {
			result += entry.getValue() * quantities[i];
			i++;
		}
		return result;

	}

}
