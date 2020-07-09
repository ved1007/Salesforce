Feature: created New Opportunitie 

Scenario Outline: User is able to create Opportunitie 

	Given Open the Salesforce Website 
	When verify the Salesforce page title 
	Then Login with valid username and password "<username>" and "<password>" 
	And  Click login button 
	And Verify Salesforce Home page title 
	Then Click on the Opportunities tab 
	Then Click on the New button
	Then Select a record type and click Next
	And Populate New Opportunity RV Sales fields
	Then Click the Save button
	
	
	Examples: 
		|username|password|
		|vedant.jagani@campingworld.com.test| Welcome2019*|