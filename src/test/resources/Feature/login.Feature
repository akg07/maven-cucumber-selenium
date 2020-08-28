Feature: Test Flipcart login Fuctionality
@login
Scenario: Unsuccessful Login to flipcart
	Given Flipcart website is loaded.
	When user enters username and password
	Then login should not be successful and verify the message
	
@cartierSearch
Scenario: user can search their desire item
	Given user open the http://www.cartier.com/
	And user fill Watch in search bar
	And user click on the search button