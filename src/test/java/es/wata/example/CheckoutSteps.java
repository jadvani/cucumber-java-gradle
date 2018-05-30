/***
Created by Javier Advani
on May 30, 2018
***/
package es.wata.example;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckoutSteps {
	Product myProduct;
	Product myProduct2;

	Checkout checkout = new Checkout();

	@Given("the price of a {string} is {int}c")
	public void the_price_of_a_is_c(String string, double price) {
		myProduct = new Product(string, price);
	}

	@When("I checkout {int} {string}")
	public void i_checkout(Integer quantity, String string) {
		checkout.add(quantity, myProduct);
	}

	@Then("the total price should be {int}c")
	public void the_total_price_should_be_c(double expectedPrice) {
		assertEquals(expectedPrice, checkout.calculateTotalPrice(), 0.01);
	}

	@Given("the price of a {string} is {int}c and the price of a {string} is {int}c")
	public void the_price_of_a_is_c_and_the_price_of_a_is_c(String string, double price, String string2,
			double price2) {
		myProduct = new Product(string, price);
		myProduct2 = new Product(string2, price2);
	}

	@When("I checkout {int} {string} and {int} {string}")
	public void i_checkout_and(Integer quantity, String string, Integer quantity2, String string2) {
		checkout.add(quantity, myProduct);
		checkout.add(quantity2, myProduct2);
	}

}
