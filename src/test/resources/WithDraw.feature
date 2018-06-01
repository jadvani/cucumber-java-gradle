Feature: Withdraw Fixed Amount 
	The "Withdraw Cash" menu contains several fixed amounts to 
	speed up transactions for users.
	
Scenario Outline: Withdraw fixed amount 
	Given I have <Balance> in my account 
	When I choose to withdraw the fixed amount of <Withdrawal> 
	Then I should receive <Received> cash 
	And the balance of my account should be <Remaining> 
	Examples: 
		| Balance | Withdrawal | Received | Remaining |
		| $500.0    | $50.0        | $50.0      | $450.0      |
		| $500.0    | $100.0       | $100.0     | $400.0      |
		| $500.0    | $200.0       | $200.0     | $300.0      |
		
