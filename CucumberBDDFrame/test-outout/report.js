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
  "name": "Populate New Opportunity RV Sales fields",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Click the Save button",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "created-new-opportunitie;user-is-able-to-create-opportunitie;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 18,
      "id": "created-new-opportunitie;user-is-able-to-create-opportunitie;;1"
    },
    {
      "cells": [
        "vedant.jagani@campingworld.com.test",
        "Welcome2019*"
      ],
      "line": 19,
      "id": "created-new-opportunitie;user-is-able-to-create-opportunitie;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 19,
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
  "name": "Populate New Opportunity RV Sales fields",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Click the Save button",
  "keyword": "Then "
});
formatter.match({
  "location": "Opportunities.open_the_Salesforce_Website()"
});
formatter.result({
  "duration": 4093489179,
  "status": "passed"
});
formatter.match({
  "location": "Opportunities.verify_the_Salesforce_page_title()"
});
formatter.result({
  "duration": 5276228,
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
  "duration": 206210760,
  "status": "passed"
});
formatter.match({
  "location": "Opportunities.click_login_button()"
});
formatter.result({
  "duration": 2178619826,
  "status": "passed"
});
formatter.match({
  "location": "Opportunities.verify_Salesforce_Home_page_title()"
});
formatter.result({
  "duration": 9637178223,
  "status": "passed"
});
formatter.match({
  "location": "Opportunities.click_on_the_Opportunities_tab()"
});
formatter.result({
  "duration": 4015121655,
  "status": "passed"
});
formatter.match({
  "location": "Opportunities.click_on_the_New_button()"
});
formatter.result({
  "duration": 153288930,
  "status": "passed"
});
formatter.match({
  "location": "Opportunities.select_a_record_type_and_click_Next()"
});
formatter.result({
  "duration": 921697811,
  "status": "passed"
});
formatter.match({
  "location": "Opportunities.populate_New_Opportunity_RV_Sales_fields()"
});
formatter.result({
  "duration": 5215083802,
  "status": "passed"
});
formatter.match({
  "location": "Opportunities.click_the_Save_button()"
});
formatter.result({
  "duration": 43286,
  "status": "passed"
});
});