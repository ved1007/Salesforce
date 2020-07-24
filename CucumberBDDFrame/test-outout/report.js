$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/vedant.jagani/git/Salesforce/CucumberBDDFrame/src/main/java/Features/Opportunities.feature");
formatter.feature({
  "line": 1,
  "name": "created New Opportunitie",
  "description": "",
  "id": "created-new-opportunitie",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User is able to create Opportunitie",
  "description": "",
  "id": "created-new-opportunitie;user-is-able-to-create-opportunitie",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Open the Salesforce Website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify the Salesforce page title as \"Login | Salesforce\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Login with valid username and password \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Verify Salesforce Home page title as \"Lightning Experience\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click on the Opportunities tab",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Click on the New button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Select a record type and click Next",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Populate System Admin Layout fields",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Opportunity Information",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Interested In Attributes",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Interested In Details",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Towing Information",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Currently Own Trade-InCurrently Own TradeIn from Web Lead fields",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Pupulate Info from lead fields",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Lead Source",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Enter the Description Information",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Other data fields",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "System Information fields",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Click the Save button",
  "keyword": "Then "
});
formatter.examples({
  "line": 27,
  "name": "",
  "description": "",
  "id": "created-new-opportunitie;user-is-able-to-create-opportunitie;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 28,
      "id": "created-new-opportunitie;user-is-able-to-create-opportunitie;;1"
    },
    {
      "cells": [
        "vedant.jagani@campingworld.com.test",
        "Welcome2019*"
      ],
      "line": 29,
      "id": "created-new-opportunitie;user-is-able-to-create-opportunitie;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 29,
  "name": "User is able to create Opportunitie",
  "description": "",
  "id": "created-new-opportunitie;user-is-able-to-create-opportunitie;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Open the Salesforce Website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify the Salesforce page title as \"Login | Salesforce\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Login with valid username and password \"vedant.jagani@campingworld.com.test\" and \"Welcome2019*\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Verify Salesforce Home page title as \"Lightning Experience\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click on the Opportunities tab",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Click on the New button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Select a record type and click Next",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Populate System Admin Layout fields",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Opportunity Information",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Interested In Attributes",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Interested In Details",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Towing Information",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Currently Own Trade-InCurrently Own TradeIn from Web Lead fields",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Pupulate Info from lead fields",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Lead Source",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Enter the Description Information",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Other data fields",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "System Information fields",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Click the Save button",
  "keyword": "Then "
});
formatter.match({
  "location": "OpportunitiesStepDef.open_the_Salesforce_Website()"
});
formatter.result({
  "duration": 5515425685,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login | Salesforce",
      "offset": 37
    }
  ],
  "location": "OpportunitiesStepDef.verify_the_Salesforce_page_title_as(String)"
});
formatter.result({
  "duration": 7537764,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vedant.jagani@campingworld.com.test",
      "offset": 40
    },
    {
      "val": "Welcome2019*",
      "offset": 82
    }
  ],
  "location": "OpportunitiesStepDef.login_with_valid_username_and_password_and(String,String)"
});
formatter.result({
  "duration": 194932590,
  "status": "passed"
});
formatter.match({
  "location": "OpportunitiesStepDef.click_login_button()"
});
formatter.result({
  "duration": 1997168543,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lightning Experience",
      "offset": 38
    }
  ],
  "location": "OpportunitiesStepDef.verify_Salesforce_Home_page_title_as(String)"
});
formatter.result({
  "duration": 6822233107,
  "status": "passed"
});
formatter.match({
  "location": "OpportunitiesStepDef.click_on_the_Opportunities_tab()"
});
formatter.result({
  "duration": 65439473,
  "status": "passed"
});
formatter.match({
  "location": "OpportunitiesStepDef.click_on_the_New_button()"
});
formatter.result({
  "duration": 1487312759,
  "status": "passed"
});
formatter.match({
  "location": "OpportunitiesStepDef.select_a_record_type_and_click_Next()"
});
formatter.result({
  "duration": 1386172079,
  "status": "passed"
});
formatter.match({
  "location": "OpportunitiesStepDef.populate_System_Admin_Layout_fields()"
});
formatter.result({
  "duration": 5985465378,
  "status": "passed"
});
formatter.match({
  "location": "OpportunitiesStepDef.Opportunity_Information()"
});
formatter.result({
  "duration": 2128648627,
  "error_message": "java.lang.NullPointerException\n\tat stepDefinitions.OpportunitiesStepDef.Opportunity_Information(OpportunitiesStepDef.java:234)\n\tat ✽.And Opportunity Information(/Users/vedant.jagani/git/Salesforce/CucumberBDDFrame/src/main/java/Features/Opportunities.feature:14)\n",
  "status": "failed"
});
formatter.match({
  "location": "OpportunitiesStepDef.populate_Interested_In_Attributes_fields()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OpportunitiesStepDef.Interested_In_Details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OpportunitiesStepDef.Towing_Information()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OpportunitiesStepDef.currently_Own_Trade_InCurrently_Own_TradeIn_from_Web_Lead_fields()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OpportunitiesStepDef.pupulate_Info_from_lead_fields()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OpportunitiesStepDef.Lead_Source()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OpportunitiesStepDef.enter_the_Description_Information()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OpportunitiesStepDef.populate_Other_data_fields()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OpportunitiesStepDef.System_Information_fields()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OpportunitiesStepDef.click_the_Save_button()"
});
formatter.result({
  "status": "skipped"
});
});