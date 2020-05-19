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
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "salesforce-create-new-account;user-is-able-to-create-new-account-in-the-salesforce-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 16,
      "id": "salesforce-create-new-account;user-is-able-to-create-new-account-in-the-salesforce-scenario;;1"
    },
    {
      "cells": [
        "vedant.jagani@campingworld.com.test",
        "Welcome2019*"
      ],
      "line": 17,
      "id": "salesforce-create-new-account;user-is-able-to-create-new-account-in-the-salesforce-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
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
formatter.match({
  "location": "CreateAccount.user_will_Open_Salesforce_Website()"
});
formatter.result({
  "duration": 3811290199,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.verify_title_for_the_Salesforce_page()"
});
formatter.result({
  "duration": 6722869,
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
  "duration": 249809144,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.user_click_the_login_button()"
});
formatter.result({
  "duration": 2003575147,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.verify_title_for_the_Salesforce_Home_page()"
});
formatter.result({
  "duration": 5399221283,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.user_will_click_on_the_waffle_icon()"
});
formatter.result({
  "duration": 3302576769,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.user_will_navigate_to_the_Search_field_and_search_for_the_Account()"
});
formatter.result({
  "duration": 313295027,
  "status": "passed"
});
});