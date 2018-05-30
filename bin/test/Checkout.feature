Feature: checkout stuff
Scenario: 1 scanned separately 
Given the price of a "banana" is 40c 
When I checkout 1 "banana"
Then the total price should be 40c

Scenario: 1 apple scanned separately 
Given the price of a "apple" is 25c 
When I checkout 1 "apple"
Then the total price should be 25c

Scenario: 1 apple scanned separately 
Given the price of a "apple" is 25c and the price of a "banana" is 40c
When I checkout 1 "apple" and 2 "banana"
Then the total price should be 105c