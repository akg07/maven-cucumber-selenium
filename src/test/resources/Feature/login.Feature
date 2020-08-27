Feature: Test Flipcart login Fuctionality

Scenario: Unsuccessful Login to flipcart
	Given Flipcart website is loaded.
	When user enters username and password
	Then login should not be successful and verify the message