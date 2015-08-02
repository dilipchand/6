Feature: Verifying functionality of Find a Branch or ATM.

Scenario Outline: Verify the advanced search functionality

Given I have launched the http://www.chase.com
	And I click on "ATM & branch"
	And search page is opened with a "Search Field", "Search Button" and "Advanced Search Option"
	And I click on "Advanced search"
	And the "Advanced Search Options" are visible
When I select the check box "Chase ATM", "Allow deposits"
	And I enter the <SEARCH_INPUT> in the "Search Field"
	And I click on "Bottom Search button"
Then ATM & Branch search results are displayed

Examples:
|SEARCH_INPUT	|
|78741			|