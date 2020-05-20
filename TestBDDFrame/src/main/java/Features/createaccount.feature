Feature: Salesforce Create New Account

Scenario Outline: User is able to create New Account in the Salesforce Scenario

Given User will Open Salesforce Website
When verify title for the Salesforce page
Then user will enter "<username>" and "<password>"
And user click  the login button
And verify title for the Salesforce Home page
Then user will click on the waffle icon
Then user will navigate to the Search field and search for the Account
Then user weill verify title for the Account page
Then user will click on the New button
Then user will select the Household radio button
Then user will click the Next button within the New Account window
Then user will verify that the required fields message is displayed
Then user will populate fields within the Account Information section
Then user will populate fields within the Address Inforamtion section
Then user will populate fields within the Cloud MDM Information
And user will create new account by clicking the Save button


Examples: 
	| username                                                | password          |
	| vedant.jagani@campingworld.com.test| Welcome2019*|