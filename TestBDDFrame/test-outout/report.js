$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/vedant.jagani/git/repository/TestBDDFrame/src/main/java/Features/createaccount.feature");
formatter.feature({
  "line": 1,
  "name": "Salesforce Create New Account",
  "description": "",
  "id": "salesforce-create-new-account",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User is able to create New Account in the Salesforce Scenario",
  "description": "",
  "id": "salesforce-create-new-account;user-is-able-to-create-new-account-in-the-salesforce-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User will Open Salesforce Website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify title for the Salesforce page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user will enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click  the login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "verify title for the Salesforce Home page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user will click on the waffle icon",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user will navigate to the Search field and search for the Account",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user weill verify title for the Account page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user will click on the New button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user will select the Household radio button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user will click the Next button within the New Account window",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user will verify that the required fields message is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user will populate fields within the Account Information section",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user will populate fields within the Address Inforamtion section",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user will populate fields within the Cloud MDM Information",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user will create new account by clicking the Save button",
  "keyword": "And "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "salesforce-create-new-account;user-is-able-to-create-new-account-in-the-salesforce-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 24,
      "id": "salesforce-create-new-account;user-is-able-to-create-new-account-in-the-salesforce-scenario;;1"
    },
    {
      "cells": [
        "vedant.jagani@campingworld.com.test",
        "Welcome2019*"
      ],
      "line": 25,
      "id": "salesforce-create-new-account;user-is-able-to-create-new-account-in-the-salesforce-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 25,
  "name": "User is able to create New Account in the Salesforce Scenario",
  "description": "",
  "id": "salesforce-create-new-account;user-is-able-to-create-new-account-in-the-salesforce-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User will Open Salesforce Website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify title for the Salesforce page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user will enter \"vedant.jagani@campingworld.com.test\" and \"Welcome2019*\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click  the login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "verify title for the Salesforce Home page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user will click on the waffle icon",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user will navigate to the Search field and search for the Account",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user weill verify title for the Account page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user will click on the New button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user will select the Household radio button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user will click the Next button within the New Account window",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user will verify that the required fields message is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user will populate fields within the Account Information section",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user will populate fields within the Address Inforamtion section",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user will populate fields within the Cloud MDM Information",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user will create new account by clicking the Save button",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAccount.user_will_Open_Salesforce_Website()"
});
formatter.result({
  "duration": 5825483726,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.verify_title_for_the_Salesforce_page()"
});
formatter.result({
  "duration": 8036172,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vedant.jagani@campingworld.com.test",
      "offset": 17
    },
    {
      "val": "Welcome2019*",
      "offset": 59
    }
  ],
  "location": "CreateAccount.user_will_enter_and(String,String)"
});
formatter.result({
  "duration": 278397772,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.user_click_the_login_button()"
});
formatter.result({
  "duration": 2241885030,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.verify_title_for_the_Salesforce_Home_page()"
});
formatter.result({
  "duration": 11559042858,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.user_will_click_on_the_waffle_icon()"
});
formatter.result({
  "duration": 3413161530,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.user_will_navigate_to_the_Search_field_and_search_for_the_Account()"
});
formatter.result({
  "duration": 7493582138,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.user_weill_verify_title_for_the_Account_page()"
});
formatter.result({
  "duration": 6067192,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.user_will_click_on_the_New_button()"
});
formatter.result({
  "duration": 173627867,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.user_will_select_the_Household_radio_button()"
});
formatter.result({
  "duration": 50276,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.user_will_click_the_Next_button_within_the_New_Account_window()"
});
formatter.result({
  "duration": 29514,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.user_will_verify_that_the_required_fields_message_is_displayed()"
});
formatter.result({
  "duration": 28231,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.user_will_populate_fields_within_the_Account_Information_section()"
});
formatter.result({
  "duration": 103628,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.user_will_populate_fields_within_the_Address_Inforamtion_section()"
});
formatter.result({
  "duration": 41551,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.user_will_populate_fields_within_the_Cloud_MDM_Information()"
});
formatter.result({
  "duration": 49963,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.user_will_create_new_account_by_clicking_the_Save_button()"
});
formatter.result({
  "duration": 112064,
  "status": "passed"
});
});