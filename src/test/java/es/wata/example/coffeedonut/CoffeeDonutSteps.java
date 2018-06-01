/***
Created by Javier Advani
on May 31, 2018
***/
package es.wata.example.coffeedonut;

import static org.junit.Assert.assertEquals;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;

public class CoffeeDonutSteps {

	public List<String> myList;

	@Given("this data table:")
	public void this_data_table(DataTable dataTable) {

		myList = dataTable.asList(String.class);

	}

	@Then("our list should have {int} elements")
	public void should_have(int int1) {
		assertEquals(int1, myList.size());
	}

}
