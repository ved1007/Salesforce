$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/vedant.jagani/git/Salesforce/CucumberBDDFrame/src/main/java/Features/newaccount.feature");
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
  "name": "user will populate fields within the Account Information section \"\u003caccountname\u003e\" and \"\u003cphone\u003e\" and \"\u003cassetcount\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user will populate fields within the Address Inforamtion section \"\u003cbillingstreet\u003e\" and \"\u003cshippingstreet\u003e\" and \"\u003cbillingcity\u003e\" and \"\u003cshippingcity\u003e\" and \"\u003cbillingzipcode\u003e\" and \"\u003cshippingzipcode\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user will populate fields within the Cloud MDM Information",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Click on the Save button",
  "keyword": "And "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "create-new-account;within-the-salesforce-application-user-is-able-to-create-new-account;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accountname",
        "phone",
        "assetcount",
        "billingstreet",
        "shippingstreet",
        "billingcity",
        "shippingcity",
        "billingzipCode",
        "shippingzipcode"
      ],
      "line": 26,
      "id": "create-new-account;within-the-salesforce-application-user-is-able-to-create-new-account;;1"
    },
    {
      "cells": [
        "vedant.jagani@campingworld.com.test",
        "Welcome2019*",
        "Automation1",
        "1234567890",
        "101",
        "101 Chicago St",
        "102 Chicago St",
        "Chicago",
        "S Chicago",
        "60103",
        "60169"
      ],
      "line": 27,
      "id": "create-new-account;within-the-salesforce-application-user-is-able-to-create-new-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 27,
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
  "name": "user will populate fields within the Account Information section \"Automation1\" and \"1234567890\" and \"101\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user will populate fields within the Address Inforamtion section \"101 Chicago St\" and \"102 Chicago St\" and \"Chicago\" and \"S Chicago\" and \"\u003cbillingzipcode\u003e\" and \"60169\"",
  "matchedColumns": [
    5,
    6,
    7,
    8,
    10
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user will populate fields within the Cloud MDM Information",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Click on the Save button",
  "keyword": "And "
});
formatter.match({
  "location": "NewAccount.user_will_Open_Salesforce_Website()"
});
formatter.result({
  "duration": 4718173634,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.verify_title_for_the_Salesforce_page()"
});
formatter.result({
  "duration": 10659567,
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
  "duration": 226096610,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.user_click_the_login_button()"
});
formatter.result({
  "duration": 2596649416,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.verify_title_for_the_Salesforce_Home_page()"
});
formatter.result({
  "duration": 8397467665,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.user_will_click_on_the_waffle_icon()"
});
formatter.result({
  "duration": 3233781800,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.user_will_navigate_to_the_Search_field_and_search_for_the_Account()"
});
formatter.result({
  "duration": 7480151326,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.user_weill_verify_title_for_the_Account_page()"
});
formatter.result({
  "duration": 5939738,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.user_will_click_on_the_New_button()"
});
formatter.result({
  "duration": 2414335350,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.user_will_select_the_Household_radio_button()"
});
formatter.result({
  "duration": 33148,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.user_will_click_the_Next_button_within_the_New_Account_window()"
});
formatter.result({
  "duration": 1199521954,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.user_will_verify_that_the_required_fields_message_is_displayed()"
});
formatter.result({
  "duration": 3766135445,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Automation1",
      "offset": 66
    },
    {
      "val": "1234567890",
      "offset": 84
    },
    {
      "val": "101",
      "offset": 101
    }
  ],
  "location": "NewAccount.user_will_populate_fields_within_the_Account_Information_section_and_and(String,String,String)"
});
formatter.result({
  "duration": 784773291,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "101 Chicago St",
      "offset": 66
    },
    {
      "val": "102 Chicago St",
      "offset": 87
    },
    {
      "val": "Chicago",
      "offset": 108
    },
    {
      "val": "S Chicago",
      "offset": 122
    },
    {
      "val": "\u003cbillingzipcode\u003e",
      "offset": 138
    },
    {
      "val": "60169",
      "offset": 161
    }
  ],
  "location": "NewAccount.user_will_populate_fields_within_the_Address_Inforamtion_section_and_and_and_and_and(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 7397001150,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.user_will_populate_fields_within_the_Cloud_MDM_Information()"
});
formatter.result({
  "duration": 2107707294,
  "status": "passed"
});
formatter.match({
  "location": "NewAccount.click_on_the_Save_button()"
});
formatter.result({
  "duration": 659850512,
  "status": "passed"
});
});