/***
Created by Javier Advani
on Jun 1, 2018
***/
package es.wata.example.withdraw;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WithDrawSteps {
	Account account;
	double withdraw;

	@Given("I have ${double} in my account")
	public void i_have_$_in_my_account(double int1) {
		account = new Account(int1);
	}

	@When("I choose to withdraw the fixed amount of ${double}")
	public void i_choose_to_withdraw_the_fixed_amount_of_$(double quantity) {
		withdraw = quantity;
	}

	@Then("I should receive ${double} cash")
	public void i_should_receive_$_cash(double int1) {
		assertEquals(int1, account.withdrawMoney(withdraw), 0.01);
	}

	@Then("the balance of my account should be ${double}")
	public void the_balance_of_my_account_should_be_$(double int1) {
		assertEquals(int1, account.getMoney(), 0.01);
	}

}
