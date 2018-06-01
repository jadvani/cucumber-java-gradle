/***
Created by Javier Advani
on Jun 1, 2018
***/
package es.wata.example.coffeedonut;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class CoffeeDonutWithPrice {

	Map<String, Double> products;
	ProductStock stuff;
	int[] auxArray;
	double result = 0;

	@Given("a data table:")
	public void a_data_table(DataTable dataTable) {

		products = dataTable.asMap(String.class, Double.class);
		stuff = new ProductStock(products);

	}

	@When("we buy {int} coffee and {int} donuts")
	public void we_but_coffee_and_donuts(Integer int1, Integer int2) {
		auxArray = new int[] { int1, int2 };
		result = stuff.calculatePrice(auxArray);

	}

	@Then("we should pay {double}")
	public void we_should_pay(Double double1) {
		assertEquals(4, result, 0.01);

	}
}
