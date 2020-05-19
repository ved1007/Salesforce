Feature: Salesforce Create New Account

Scenario Outline: User is able to create New Account in the Salesforce Scenario

Given User will Open Salesforce Website
When verify title for the Salesforce page
Then user will enter "<username>" and "<password>"
And user click  the login button
And verify title for the Salesforce Home page
Then user will click on the waffle icon
Then user will navigate to the Search field and search for the Account



Examples: 
	| username                                                | password          |
	| vedant.jagani@campingworld.com.test| Welcome2019*|