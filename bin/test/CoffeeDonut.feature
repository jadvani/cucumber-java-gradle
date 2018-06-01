Feature: Attempting to grab some elements as List 
	A list can be represented as DataTable. We have to convert it to List or Map in our step. 

Scenario: we want to create a List from different strings 

	Given this data table: 
		| productName	|
		| coffee 		|
		| donut  		|
	Then our list should have 3 elements