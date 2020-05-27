$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/vedant.jagani/Documents/Automation/CucumberBDDFrame/src/main/java/Features/newaccount.feature");
formatter.feature({
  "line": 1,
  "name": "Create New Account",
  "description": "",
  "id": "create-new-account",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Within the Salesforce application User is able to create New Account",
  "description": "",
  "id": "create-new-account;within-the-salesforce-application-user-is-able-to-create-new-account",
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
formatter.step({
  "line": 21,
  "name": "use will close the application",
  "keyword": "And "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "create-new-account;within-the-salesforce-application-user-is-able-to-create-new-account;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 25,
      "id": "create-new-account;within-the-salesforce-application-user-is-able-to-create-new-account;;1"
    },
    {
      "cells": [
        "vedant.jagani@campingworld.com.test",
        "Welcome2019*"
      ],
      "line": 26,
      "id": "create-new-account;within-the-salesforce-application-user-is-able-to-create-new-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 26,
  "name": "Within the Salesforce application User is able to create New Account",
  "description": "",
  "id": "create-new-account;within-the-salesforce-application-user-is-able-to-create-new-account;;2",
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
formatter.step({
  "line": 21,
  "name": "use will close the application",
  "keyword": "And "
});
formatter.match({
  "location": "NewAccount.user_will_Open_Salesforce_Website()"
});
formatter.result({
  "duration": 3354978151,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.verify_title_for_the_Salesforce_page()"
});
formatter.result({
  "duration": 5366005,
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
  "location": "NewAccount.user_will_enter_and(String,String)"
});
formatter.result({
  "duration": 189855007,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.user_click_the_login_button()"
});
formatter.result({
  "duration": 2059405985,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.verify_title_for_the_Salesforce_Home_page()"
});
formatter.result({
  "duration": 8994343898,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.user_will_click_on_the_waffle_icon()"
});
formatter.result({
  "duration": 3164428406,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.user_will_navigate_to_the_Search_field_and_search_for_the_Account()"
});
formatter.result({
  "duration": 7407573115,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.user_weill_verify_title_for_the_Account_page()"
});
formatter.result({
  "duration": 4884271,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.user_will_click_on_the_New_button()"
});
formatter.result({
  "duration": 2275050097,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.user_will_select_the_Household_radio_button()"
});
formatter.result({
  "duration": 27801,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.user_will_click_the_Next_button_within_the_New_Account_window()"
});
formatter.result({
  "duration": 23292,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.user_will_verify_that_the_required_fields_message_is_displayed()"
});
formatter.result({
  "duration": 20464,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.user_will_populate_fields_within_the_Account_Information_section()"
});
formatter.result({
  "duration": 13964,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.user_will_populate_fields_within_the_Address_Inforamtion_section()"
});
formatter.result({
  "duration": 12778,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.user_will_populate_fields_within_the_Cloud_MDM_Information()"
});
formatter.result({
  "duration": 12763,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.user_will_create_new_account_by_clicking_the_Save_button()"
});
formatter.result({
  "duration": 12708,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.use_will_close_the_application()"
});
formatter.result({
  "duration": 15511,
  "status": "passed"
});
});