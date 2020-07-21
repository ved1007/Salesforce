Feature: Delete created Account

Scenario Outline: Within the Salesforce application User is able to delete Account

Given Open Salesforce Website
When verify Salesforce page title
Then enter "<username>" and "<password>"
And  click  the login button
And verify Salesforce Home page title
Then click on the waffle icon
Then Search for the Accounts option
Then Verify title for the Account page
Then user will click on the Account Name
And user will delete the account
Then Take a screenshot
Then close the application




Examples: 
	| username                           | password    |
	| vedant.jagani@campingworld.com.test| Welcome2019*|
	
	  