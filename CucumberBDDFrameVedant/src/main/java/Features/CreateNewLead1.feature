Feature: Delete created Account 

Scenario Outline: 
	Within the Salesforce application User is able to delete Account 

	Given Salesforce site
	When Salesforce page title 
	Then login as Dealer Sales or DealerSalesManagerOrSystemAdmin enter "<username>" and "<password>" 
	And  click login button 
	And Salesforce Home page title 
	And click Leads tab
	Then click on the new button
	Then Choose Location and Save
#	And click the Next button
#	Then Fill in the information "<firstname>" "<lastname>" "<email>" "<phone>" "<address>" 
#	Then Click Search
#	Then Click Save
#	Then New Lead is created
#	And Click on Detail tab to verify Lead Detail
	
	
	
	
	Examples: 
		| username                           | password    | firstname|lastname|email|phone     |address|
		| vedant.jagani@campingworld.com.train| Welcome2019*|ABC       |XYZ     |aC ST|1231231234|123 St | 