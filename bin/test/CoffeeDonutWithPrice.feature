Feature: Attempting to grab some elements as List with prices now 
	A list can be represented as DataTable. We have to convert it to List or Map in our step. 
	#this is a comment, documentation is with """   something """
Scenario: We want to buy coffee and donuts for the office 

	Given a data table: 
	
		| coffee 		| 1.5 |
		| donut  		| 1.25 |
	When we buy 1 coffee and 2 donuts 
	Then we should pay 4.0 
