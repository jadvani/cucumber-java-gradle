Feature: checkout stuff
Scenario: compro una banana
Given the price of a "banana" is 40c 
When I checkout 1 "banana"
Then the total price should be 40c

Scenario: compro una manzana
Given the price of a "apple" is 25c 
When I checkout 1 "apple"
Then the total price should be 25c

Scenario: compro una manzana y dos plátanos
Given the price of a "apple" is 25c and the price of a "banana" is 40c
When I checkout 1 "apple" and 2 "banana"
Then the total price should be 105c