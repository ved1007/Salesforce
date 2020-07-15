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
  "name": "verify the Salesforce page title",
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
  "name": "Verify Salesforce Home page title",
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
  "name": "verify the Salesforce page title",
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
  "name": "Verify Salesforce Home page title",
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
  "location": "Opportunities.open_the_Salesforce_Website()"
});
formatter.result({
  "duration": 4433197310,
  "status": "passed"
});
formatter.match({
  "location": "Opportunities.verify_the_Salesforce_page_title()"
});
formatter.result({
  "duration": 5292475,
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
  "location": "Opportunities.login_with_valid_username_and_password_and(String,String)"
});
formatter.result({
  "duration": 190772431,
  "status": "passed"
});
formatter.match({
  "location": "Opportunities.click_login_button()"
});
formatter.result({
  "duration": 1729771768,
  "status": "passed"
});
formatter.match({
  "location": "Opportunities.verify_Salesforce_Home_page_title()"
});
formatter.result({
  "duration": 7813137223,
  "status": "passed"
});
formatter.match({
  "location": "Opportunities.click_on_the_Opportunities_tab()"
});
formatter.result({
  "duration": 4026271020,
  "status": "passed"
});
formatter.match({
  "location": "Opportunities.click_on_the_New_button()"
});
formatter.result({
  "duration": 141143648,
  "status": "passed"
});
formatter.match({
  "location": "Opportunities.select_a_record_type_and_click_Next()"
});
formatter.result({
  "duration": 6573749491,
  "status": "passed"
});
formatter.match({
  "location": "Opportunities.populate_System_Admin_Layout_fields()"
});
formatter.result({
  "duration": 2035927006,
  "status": "passed"
});
formatter.match({
  "location": "Opportunities.Opportunity_Information()"
});
formatter.result({
  "duration": 14280404544,
  "status": "passed"
});
formatter.match({
  "location": "Opportunities.populate_Interested_In_Attributes_fields()"
});
formatter.result({
  "duration": 1452001415,
  "status": "passed"
});
formatter.match({
  "location": "Opportunities.Interested_In_Details()"
});
formatter.result({
  "duration": 10486936160,
  "status": "passed"
});
formatter.match({
  "location": "Opportunities.Towing_Information()"
});
formatter.result({
  "duration": 4782267081,
  "status": "passed"
});
formatter.match({
  "location": "Opportunities.currently_Own_Trade_InCurrently_Own_TradeIn_from_Web_Lead_fields()"
});
formatter.result({
  "duration": 12461694632,
  "status": "passed"
});
formatter.match({
  "location": "Opportunities.pupulate_Info_from_lead_fields()"
});
formatter.result({
  "duration": 2443720158,
  "status": "passed"
});
formatter.match({
  "location": "Opportunities.Lead_Source()"
});
formatter.result({
  "duration": 3499350198,
  "status": "passed"
});
formatter.match({
  "location": "Opportunities.enter_the_Description_Information()"
});
formatter.result({
  "duration": 309339616,
  "status": "passed"
});
formatter.match({
  "location": "Opportunities.populate_Other_data_fields()"
});
formatter.result({
  "duration": 11726612658,
  "status": "passed"
});
formatter.match({
  "location": "Opportunities.System_Information_fields()"
});
formatter.result({
  "duration": 3260749525,
  "status": "passed"
});
formatter.match({
  "location": "Opportunities.click_the_Save_button()"
});
formatter.result({
  "duration": 30304,
  "status": "passed"
});
});