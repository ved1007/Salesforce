Feature: System Admin Login

Scenario Outline: Login with System Admin User ID

Given Open Salesforce Application
When verify title Salesforce login page
Then populate "<username>" and "<password>"
And click the login button
And verify Salesforce Home title
Then user will close the application


Examples: 
	| username                           | password          |
	| vedant.jagani@campingworld.com.test| Welcome2019*|