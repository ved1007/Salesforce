Feature: Created New Lead 

Scenario Outline: 
	Within the Salesforce application User is able to create new leads

	Given Salesforce site 
	When Salesforce page title as "Login | Salesforce" 
	Then Login as Dealer Sales or DealerSalesManagerOrSystemAdmin enter "<username>" and "<password>" 
	And  Click login btn 
	And Salesforce Home page title as "Lightning Experience"
	And Click Leads tab 
	Then Click on the new button 
	Then Click on Next button 
	Then Choose Location and Save 	
	Then Populate the Search Criteria fields 
	Then Click Search 
	
	
	
	Examples: 
		| username                           | password    | 
		| vedant.jagani@campingworld.com.test| Welcome2019*|